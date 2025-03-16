package level03;

import java.util.*;
public class Exam25304 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 1. 먼저 영수증에 적힌 총 금액 X 와 구매한 물건의 종류의 수 N 을 받는다. 값을 저장해줄 P 변수를 만든다.
    int X = scanner.nextInt(), N = scanner.nextInt(), P = 0;

    // 2. 종류의 수 N 만큼 For 문을 돌린다.
    for (int i=0; i<N;i++){
      // 3. 물건의 가격을 a, 물건의 개수를 b 로 받는다.
      int a = scanner.nextInt(), b = scanner.nextInt();
      P += a*b;
    }
    System.out.println((X==P)?"Yes":"No");
  }
}
