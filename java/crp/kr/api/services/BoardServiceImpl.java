package crp.kr.api.services;

import crp.kr.api.domains.Board;
import crp.kr.api.repositories.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName:crp.kr.api.services
 * fileName        :BoardServiceImpl
 * author           : chohyungook
 * date               :2022-05-04
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-04chohyungook최초 생성
 */
@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{

    private final BoardRepository repository;

    @Override
    public String write(Board write) {
        return null;
    }

    @Override
    public String list(Board list) {
        return null;
    }
}
