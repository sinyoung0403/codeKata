package level02;

import java.util.Scanner;
public class Exam14681 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    if(X>0){ // X 양수
      System.out.println((Y>0)? 1:4);
    }
    else { // X 음수
      System.out.println((Y>0)? 2:3);
    }
  }
}
