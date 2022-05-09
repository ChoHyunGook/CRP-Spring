package crp.kr.api.board.services;

import crp.kr.api.board.domains.Article;
import crp.kr.api.board.domains.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName:crp.kr.api.board.services
 * fileName        :CommentService
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
public interface CommentService {

    List<Comment> findAll();

    List<Comment> findAll(Sort sort);

    Page<Comment> findAll(Pageable pageable);

    long count();

    String put(Comment comment);

    String delete(Comment comment);

    String save(Comment comment);
}
