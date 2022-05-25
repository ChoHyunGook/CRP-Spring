package crp.kr.api.user.repositories;

import crp.kr.api.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * packageName:crp.kr.api.repositories
 * fileName        :UserRepository
 * author           : chohyungook
 * date               :2022-05-03
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03 chohyungook 최초 생성
 */

interface UserCustomRepository {
    //  000. 사용자 비밀번호와 이메일을 수정하시오.
    @Query(value = "update User u set u.password = :password, u.email = :email where u.userId = :userId",
            nativeQuery = true)
    int update(@Param("password") String password, @Param("email") String email);

//    String put(User user);

//    String login(User user);
}

@Repository // generator → 존재할 함수 (function*), 와이파이의 개념
// JpaRepository : 임베디드 repository
public interface UserRepository extends JpaRepository<User, Long> { // 인터페이스는 다중 상속 가능 (일반 클래스 불가)
    Optional<User> findByUsername(String username);
}
