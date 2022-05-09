package crp.kr.api.Soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName:crp.kr.api.Soccer.domains
 * fileName        :Soccer
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
@Table(name = "schedule")
public class Schedule extends Stadium{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String stadiumId;
    @Column private String scheDate;
    @Column private String gubun;
    @Column(nullable = false) private String hometeamId;
    @Column private String awayteamId;
    @Column private String homeScore;
    @Column private String awayScore;

}
