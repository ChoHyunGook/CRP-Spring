package crp.kr.api.repositories;

import crp.kr.api.domains.Board;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * packageName:crp.kr.api.repositories
 * fileName        :BoardRepositoryImpl
 * author           : chohyungook
 * date               :2022-05-04
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-04chohyungook최초 생성
 */
@Repository
public class BoardRepositoryImpl implements BoardRepository{

    @Override
    public List<Board> findAll() {
        return null;
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Board> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Board entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Board> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Board> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Board> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Board> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Board> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Board> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Board> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Board getOne(Long aLong) {
        return null;
    }

    @Override
    public Board getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Board> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Board> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Board> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Board> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Board> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Board> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Board, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
