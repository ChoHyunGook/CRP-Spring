package crp.kr.api.board.services;

import crp.kr.api.auth.domains.User;
import crp.kr.api.board.domains.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName:crp.kr.api.board.services
 * fileName        :ArticleService
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
public interface ArticleService {

    List<Article> findAll();

    List<Article> findAll(Sort sort);

    Page<Article> findAll(Pageable pageable);

    long count();

    String put(Article article);

    String delete(Article article);

    String save(Article article);

}
