import java.util.*;
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = Arrays.stream(arr).reduce(0,(s1,s2)-> s1+s2);
        return (double)sum/arr.length;
    }
}