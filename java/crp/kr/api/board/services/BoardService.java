package crp.kr.api.board.services;

import crp.kr.api.board.domains.Article;
import crp.kr.api.board.domains.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName:crp.kr.api.services
 * fileName        :BoardService
 * author           : chohyungook
 * date               :2022-05-04
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-04chohyungook최초 생성
 */
public interface BoardService {

    List<Board> findAll();

    List<Board> findAll(Sort sort);

    Page<Board> findAll(Pageable pageable);

    long count();

    String put(Board board);

    String delete(Board board);

    String save(Board board);

}
