package level01;

public class Exam12943 {
  public int solution(int num) {
    long number = (long) num;
    int answer = 0;
    int count = 0;
    while (number != 1){
      if(count == 500){
        break;
      }
      if (number % 2 == 0) {
        number /= 2;
      } else {
        number = number * 3 + 1;
      }
      count++;
    }
    if (count == 500) {
      answer = -1;
    } else {
      answer = count;
    }
    return answer;
  }
}
