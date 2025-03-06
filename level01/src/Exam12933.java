import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exam12933 {
  class Solution {
    public long solution(long n) {
      List<Long> numberList = new ArrayList<>();

      while (n > 0) {
        numberList.add(0,n%10);
        n /= 10;
      }

      String answer = numberList.stream().sorted(Comparator.reverseOrder())
              .map(String::valueOf)
              .reduce((s1, s2) -> s1 + s2).orElse("");

      return Long.valueOf(answer);
    }
  }
}
