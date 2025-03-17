package level01;

public class Exam76501 {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;
    int index = 0;
    for (int a : absolutes) {
      if (signs[index]) {
        answer += a;
      } else {
        answer -= a;
      }
      index ++;
    }
    return answer;
  }
}
