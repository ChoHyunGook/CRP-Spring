package crp.kr.api.soccer.repositories;

import crp.kr.api.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:crp.kr.api.Soccer.repositories
 * fileName        :PlayerRepository
 * author           : chohyungook
 * date               :2022-05-19
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-19chohyungook최초 생성
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
}
