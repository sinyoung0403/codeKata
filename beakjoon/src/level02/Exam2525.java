package level02;

import java.util.*;
public class Exam2525 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int M = scanner.nextInt();
    int inputM = scanner.nextInt();
    int plusH = (M+inputM)/60;
    int plusM = (M+inputM)%60;
    if (plusH+H >= 24) {// H를 더한 값이 24가 넘는다.
      System.out.println((plusH+H-24)+" "+plusM);
    }
    else {// H를 더한 값이 24가 안 넘는다.
      System.out.println((plusH+H)+" "+plusM);
    }
  }
}
