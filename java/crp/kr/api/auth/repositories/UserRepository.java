package crp.kr.api.auth.repositories;

import crp.kr.api.auth.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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

interface UserCustomRepository{
    void put(User user);
    String login(User user);
}


@Repository
public interface UserRepository extends JpaRepository<User,Long>, UserCustomRepository {

}
