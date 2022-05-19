package crp.kr.api.soccer.repositories;

import crp.kr.api.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:crp.kr.api.Soccer.repositories
 * fileName        :TeamRepository
 * author           : chohyungook
 * date               :2022-05-19
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-19chohyungook최초 생성
 */
@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {
}
