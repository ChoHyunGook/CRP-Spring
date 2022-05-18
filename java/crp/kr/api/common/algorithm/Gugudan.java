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

    @FunctionalInterface private interface GugudanService{
        void gugu();
    }
    @Test
    void GuguTest(){
        IntStream.rangeClosed(2,19).forEach(i->{
            IntStream.rangeClosed(1,9).forEach(j->{
                System.out.print(i + "*" + j + "=" + String.format("%2d",i * j));
                System.out.print("   ");
            });
            System.out.println();
        });
    }
}
