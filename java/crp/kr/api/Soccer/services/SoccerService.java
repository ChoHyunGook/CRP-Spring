package crp.kr.api.Soccer.services;

import crp.kr.api.Soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName:crp.kr.api.Soccer.services
 * fileName        :SoccerService
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
public interface SoccerService {
    String login(Schedule soccer);

    List<Schedule> findAll();

    List<Schedule> findAll(Sort sort);

    Page<Schedule> findAll(Pageable pageable);

    long count();

    String put(Schedule soccer);

    String delete(Schedule soccer);

    String save(Schedule soccer);

    Optional<Schedule> findById(String userid);

    boolean existById(String userid);
}
