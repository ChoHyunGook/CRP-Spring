package crp.kr.api.Soccer.repositories;

import crp.kr.api.Soccer.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:crp.kr.api.Soccer.repositories
 * fileName        :SoccerRepository
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
@Repository
public interface SoccerRepository extends JpaRepository<Schedule,Long> {
    String login(Schedule soccer);

    void put(Schedule soccer);
}
