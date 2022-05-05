package crp.kr.api.controllers;

import crp.kr.api.domains.Board;
import crp.kr.api.services.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName:crp.kr.api.controllers
 * fileName        :BoardController
 * author           : chohyungook
 * date               :2022-05-04
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-04chohyungook최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService service;

    public List<Board> findAll() {
        return null;
    }

    public List<Board> findAll(Sort sort) {
        return null;
    }

    public Page<Board> findAll(Pageable pageable) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void delete(Board entity) {

    }

    public <S extends Board> S save(S entity) {
        return null;
    }

    public <S extends Board> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    public <S extends Board> List<S> findAll(Example<S> example) {
        return null;
    }
}
