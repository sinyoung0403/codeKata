import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        long x = 0 ;
        for (int i = 1; i <= count ; i++) {
            x += (long) (price) * i ;
        }
        long answer = (long)x - (long)money ;

        return (answer>0 ? answer:0);
    }
}