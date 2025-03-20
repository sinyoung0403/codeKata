import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int a= Arrays.stream(numbers).reduce(0,(s1,s2)-> s1+s2);
        return (double)a/numbers.length;
    }
}