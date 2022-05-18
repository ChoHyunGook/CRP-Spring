package crp.kr.api.auth.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName:crp.kr.api.auth.domains
 * fileName        :Article
 * author           : chohyungook
 * date               :2022-05-18
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-18 chohyungook 최초 생성
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name="Articles")
public class Article {
    @Id
    @Column(name = "article_id")
    @GeneratedValue private long articleId;
    @Column @NotNull private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

}
