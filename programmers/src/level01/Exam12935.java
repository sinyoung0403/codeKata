package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Exam12935 {
  public static int[] solution(int[] arr) {
    List<Integer> answer = new ArrayList<>();

    if (arr.length == 1) answer.add(-1);
    else {
      OptionalInt min = Arrays.stream(arr).min();
      Arrays.stream(arr).filter(
              e -> e == min.getAsInt()
              ).forEach(e -> answer.add(e));
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    solution(new int[]{4, 3, 2, 1});
  }
}
