package crp.kr.api.services;

import crp.kr.api.domains.Board;

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
    String write(Board write);

    String list(Board list);
}
