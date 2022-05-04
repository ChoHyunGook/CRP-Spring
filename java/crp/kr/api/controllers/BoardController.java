package crp.kr.api.controllers;

import crp.kr.api.domains.Board;
import crp.kr.api.services.BoardService;
import lombok.RequiredArgsConstructor;
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

    @PostMapping("/write")
    public String getWrite(@RequestBody Board write){
        return service.write(write);
    }

    @PostMapping("/list")
    public String getList(@RequestBody Board list){
        return service.list(list);
    }
}
