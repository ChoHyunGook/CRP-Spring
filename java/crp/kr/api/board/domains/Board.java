package crp.kr.api.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName:crp.kr.api.domains
 * fileName        :Board
 * author           : chohyungook
 * date               :2022-05-04
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-04chohyungook최초 생성
 */
@Data
@Component
public class Board {
    private String passengerId;
    private String name;
    private String teamId;
    private String subject;
}
