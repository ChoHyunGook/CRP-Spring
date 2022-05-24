package crp.kr.api.user.services;

import crp.kr.api.user.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName:crp.kr.api.services
 * fileName        :UserService
 * author           : chohyungook
 * date               :2022-05-03
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03chohyungook최초 생성
 */
// Repository에 데이터를 넘겨줌 → 미들웨어
// 자바에서 미들웨어는 인터페이스로 만듦
public interface UserService {
    String login(User user); // 추상 메소드만 가짐 → Component 아님

    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    long count();

    String put(User user);

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    // custom
    List<User> findByUserName(String name);
}
