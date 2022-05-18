package crp.kr.api.board.domains;

import crp.kr.api.auth.domains.User;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;


/**
 * packageName:crp.kr.api.board.domains
 * fileName        :Article
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="Articles")
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String projects;
    @Column(nullable = false) private String startDate;
    @Column(nullable = false) private String status;
    @Column(nullable = false) private String team;
    @Column(nullable = false) private String progress;
    @Column(nullable = false) private String action;

}
