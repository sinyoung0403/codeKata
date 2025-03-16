package level02;

import java.util.*;
public class Exam2884 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int M = scanner.nextInt();

    int minusM= M-45;
    // 45분 전이 양수라면 시간을 빼지 않아도 됨.
    if(minusM >= 0){
      System.out.println(H + " " + minusM);
    }
    // 45분 전이 음수라면 시간을 빼주어야함.
    else {
      int minusH = H-1;
      minusM += 60;
      // 시간이 00시 아니라면
      if(H > 0){
        System.out.println(minusH+" "+ minusM);
      }
      else {
        System.out.println("23 "+minusM);
      }
    }
  }
}
