package crp.kr.api.common.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName:crp.kr.api.common.streams
 * fileName        :PersonStream
 * author           : chohyungook
 * date               :2022-05-16
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-16chohyungook최초 생성
 */
public class PersonStream {
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Person{
        private String name,ssn;
        @Override public String toString(){
            String gender=(ssn.substring(7).equals("1")||ssn.substring(7).equals("3"))?"남자":"여자";
            return String.format("이름: %s, 성별: %s, 나이: %s",name,gender);
        }
    }

    // 기능:회원검색
    interface PersonService{ Person search(List<Person> arr);}
    static class PersonServiceImpl implements PersonService{
        @Override
        public Person search(List<Person> arr) {
            return arr
                    .stream()
                    .filter(e->e.getName().equals("유관순")).
                    collect(Collectors.toList()).get(0);
        }
    }
    @Test
    void personStreamTest(){
        //홍길동,900101-1
        //김유신,950101-1
        //유관순,040203-4
        //남성,여성 판단 로직
        List<Person> arr = Arrays.asList(
                Person.builder().name("홍길동").ssn("900101-1").build(),
                Person.builder().name("김유신").ssn("950101-1").build(),
                Person.builder().name("유관순").ssn("040203-4").build()
        );
        System.out.println(new PersonServiceImpl().search(arr));;
    }

}
