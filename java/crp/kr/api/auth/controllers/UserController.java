package crp.kr.api.auth.controllers;

import crp.kr.api.auth.domains.User;
import crp.kr.api.auth.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName:crp.kr.api.controllers
 * fileName        :UserController
 * author           : chohyungook
 * date               :2022-05-03
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-03chohyungook최초 생성
 */
@RestController // @Component의 자식
@RequiredArgsConstructor // 필수 파라미터 → 리액트에서 props → 자식
@RequestMapping("/user")
public class UserController {
    /*
    private UserService service;
    public UserController(UserService service){
        service = new UserServiceImpl();
    }
    */
    private final UserService service; // 자동으로 controller의 생성자 안에 service가 들어감 → controller가 자식, service가 부모

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return service.login(user);
    }

    @GetMapping("/logout")
    public String logout(@RequestBody User user) {
        return "";
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PutMapping("/put")
    public String put(@RequestBody User user) {
        service.put(user);
        return "";
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody User user) { // 관리자
        service.delete(user);
        return "";
    }

    @PostMapping("/join")
    public String save(@RequestBody User user) {
        service.save(user);
        return "";
    }

    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) { // path = url → {userid}
        return service.findById(userid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return service.existsById(userid);
    }


}
