package crp.kr.api.Soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:crp.kr.api.Soccer.domains
 * fileName        :Player
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
@Data
@Component
@Entity
@Table(name = "palyer")
public class Player extends Team{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String playerId;
    @Column private String playerName;
    @Column(nullable = false) private String teamId;
    @Column private String ePlayerName;
    @Column private String nickName;
    @Column private String joinYyyy;
    @Column private String position;
    @Column private String backNo;
    @Column private String nation;
    @Column private String birthDate;
    @Column private String solar;
    @Column private int height;
    @Column private int weight;
}
