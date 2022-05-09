package crp.kr.api.Soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName:crp.kr.api.Soccer.domains
 * fileName        :Stadium
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
@Table(name = "stadium")
public class Stadium{
    @Id private Long id;
    @Column(nullable = false) private String stadiumId;
    @Column private String stadiumName;
    @Column(nullable = false) private String hometeamId;
    @Column private int seatCount;
    @Column private String address;
    @Column private String ddd;
    @Column private String tel;
}
