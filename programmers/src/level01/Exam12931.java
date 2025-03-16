package level01;

public class Exam12931 {
  public int solution(int n) {
    int answer = 0;
    String str = String.valueOf(n);
    for (int i =0; i< str.length() ; i++){
      int num = Character.getNumericValue(str.charAt(i));
      answer += num;
    }
    return answer;
  }
}
