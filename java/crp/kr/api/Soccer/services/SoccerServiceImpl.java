package crp.kr.api.Soccer.services;

import crp.kr.api.Soccer.domains.Schedule;
import crp.kr.api.Soccer.repositories.SoccerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName:crp.kr.api.Soccer.repositories
 * fileName        :SoccerServiceImpl
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
@RequiredArgsConstructor
@Service
public class SoccerServiceImpl implements SoccerService{

    private final SoccerRepository repository;
    @Override
    public String login(Schedule soccer) {
        return repository.login(soccer);
    }

    @Override
    public List<Schedule> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Schedule> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Schedule> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String put(Schedule soccer) {
        repository.put(soccer);
        return "";
    }

    @Override
    public String delete(Schedule soccer) {
        repository.delete(soccer);
        return "";
    }

    @Override
    public String save(Schedule soccer) {
        repository.save(soccer);
        return null;
    }

    @Override
    public Optional<Schedule> findById(String userid) {
        return repository.findById(0L);
    }

    @Override
    public boolean existById(String userid) {
        return repository.existsById(0L);
    }
}
