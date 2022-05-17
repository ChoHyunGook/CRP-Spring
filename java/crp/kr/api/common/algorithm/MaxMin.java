package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
 * packageName:crp.kr.api.common.algorithm
 * fileName        :MaxMin
 * author           : chohyungook
 * date               :2022-05-17
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17chohyungook최초 생성
 */
public class MaxMin {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Solution{
        private int[] arr;
        private int max, min; //elem 은 for loop에 들어 갈 때 돌아가는 값
        @Override
        public String toString(){
            return String.format("최소값:%d, 최대값:%d" ,min,max);

        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test
    void MaxMinTest(){
        int[] arr = {3,1,9,5,10};
        SolutionService f = e ->{
            int max = 0;
            int min = 10;
            for(int i : e.getArr()){
                if(i<min) min=i;
                else if(i>max) max=i;
            }
            return Solution.builder().min(min).max(max).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));


    }
}