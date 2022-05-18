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
 * fileName        :Board
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
@Table(name="Boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue
    private long boradId;
    @Column private @NotNull
    String boardName;
    @Column(name = "reg_date") @NotNull private String regDate;
    @OneToMany(mappedBy = "board")
    List<Article> articles = new ArrayList<>();
}
