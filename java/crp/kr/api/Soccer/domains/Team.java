package crp.kr.api.Soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName:crp.kr.api.Soccer.domains
 * fileName        :Team
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
@Table(name = "team")
public class Team extends Stadium{
    @Id private Long id;
    @Column(nullable = false) private String teamId;
    @Column private String regionName;
    @Column private String teamName;
    @Column private String eTeamName;
    @Column private String origYyyy;
    @Column(nullable = false) private String stadiumId;
    @Column private String zipCode1;
    @Column private String zipCode2;
    @Column private String address;
    @Column private String ddd;
    @Column private String tel;
    @Column private String fax;
    @Column private String homepage;
    @Column private String teamOwner;
}
