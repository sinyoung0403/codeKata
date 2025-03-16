package level01;

public class Exam12934 {
  class Solution {
    public long solution(long n) {
      Double sqrt = Math.sqrt(n);
      if(sqrt%1 == 0){
        return (long) ((sqrt + 1) * (sqrt + 1));
      } else {
        return -1;
      }
    }
  }
}
