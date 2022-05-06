package crp.kr.api.controllers;

import crp.kr.api.domains.Board;
import crp.kr.api.domains.User;
import crp.kr.api.services.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PostMapping("/findAll")
    public List<Board> findAll() {
        return service.findAll();
    }
    @PostMapping("/findAll/sort")
    public List<Board> findAll(Sort sort) {
        return service.findAll(sort);
    }
    @PostMapping("/findAll/pageable")
    public Page<Board> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
    @PostMapping("/count")
    public long count() {
        return service.count();
    }
    @PostMapping("/put")
    public String put(@RequestBody Board board){return service.put(board);}
    @PostMapping("/delte")
    public String delete(@RequestBody Board board) {return service.delete(board);}
    @PostMapping("/write")
    public String save(@RequestBody Board board) {
        return service.save(board);
    }
}
