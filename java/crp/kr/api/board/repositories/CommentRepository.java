package crp.kr.api.board.repositories;

import crp.kr.api.board.domains.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:crp.kr.api.board.repositories
 * fileName        :CommentRepository
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    void put(Comment comment);
}
