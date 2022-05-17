package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

/**
 * packageName:crp.kr.api.common.algorithm
 * fileName        :Gugudan
 * author           : chohyungook
 * date               :2022-05-17
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17chohyungook최초 생성
 */
public class Gugudan {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    static class Gugu{
        private int result;

        @Override
        public String toString() {
            return String.format("구구단: %d",result);
        }
    }
    @FunctionalInterface private interface GugudanService{
        Gugu gugu(Gugu g);
    }
    @Test
    void GuguTest(){
        IntStream.rangeClosed(2,9).forEach(i->{
            IntStream.rangeClosed(1,9).forEach(j->{
                System.out.print(i+"*"+j+"="+String.format("%2d",i*j));
                System.out.print("   ");
            });
            System.out.println();
        });
    }
}
