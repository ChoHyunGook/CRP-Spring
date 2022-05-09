package crp.kr.api.Soccer.controllers;

import crp.kr.api.Soccer.domains.Schedule;
import crp.kr.api.Soccer.services.SoccerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName:crp.kr.api.Soccer.controllers
 * fileName        :SoccerController
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/soccer")
public class SoccerController {
    private final SoccerService service;

    @PostMapping("/login")
    public String login(@RequestBody Schedule soccer){

        return service.login(soccer);
    }

    @GetMapping("/logout")
    public String logout(){
        return "";
    }

    @GetMapping("/findAll")
    public List<Schedule> findAll() {

        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Schedule> findAll(Sort sort) {

        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Schedule> findAll(Pageable pageable) {

        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PutMapping("/put")
    public String put(@RequestBody Schedule soccer){
        return service.put(soccer);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Schedule soccer) {
        return service.delete(soccer);
    }

    @PostMapping("/join")
    public String save(@RequestBody Schedule soccer) {
        return service.save(soccer);
    }

    @GetMapping("/findById/{userid}")
    public Optional<Schedule> findById(@PathVariable String userid) {
        return service.findById(userid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return service.existById(userid);
    }
}
