package level01;

public class Exam12947 {
  public boolean solution(int x) {
    String text =  Integer.toString(x);
    int sum = 0;
    boolean answer = false;
    for (int i = 0; i<text.length(); i++){
      sum += Character.getNumericValue(text.charAt(i));
    }
    if(x % sum == 0){
      answer = true;
    }
    return answer;
  }
}
