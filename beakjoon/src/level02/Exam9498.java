package level02;

import java.util.Scanner;
public class Exam9498 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    if (A>=90) {
      System.out.println('A');
    } else if (A>=80) {
      System.out.println('B');
    } else if (A>=70) {
      System.out.println('C');
    } else if (A>=60) {
      System.out.println('D');
    }
    else {
      System.out.println('F');
    }
  }
}
