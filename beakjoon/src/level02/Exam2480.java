package level02;

import java.util.*;
public class Exam2480 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt(), B = scanner.nextInt(), C  = scanner.nextInt();
    if (A==B && A==C){ // 세 값이 모두 같을 때.
      System.out.println(10000+A*1000);
    }
    else if (A==C || A==B || B==C) {
      System.out.println(A==B? A*100+1000 : C*100+1000);
    }
    else {
      System.out.println(Math.max(A, Math.max(C, B)) * 100);
    }
  }
}
