import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        if (arr.length == 1) return new int[] {-1 };
        else {
          OptionalInt min = Arrays.stream(arr).min();
          Arrays.stream(arr).filter(e -> e != min.getAsInt()).forEach(e -> answer.add(e));
        }   
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}