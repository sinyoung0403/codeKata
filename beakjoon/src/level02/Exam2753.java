package level02;

import java.util.*;
public class Exam2753 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    if (a%4 == 0) {
      if(a%100 == 0){
        if(a%400 == 0) {
          System.out.println(1); // 4,100,400 이면 윤년
        }
        else{
          System.out.println(0); // 4,100 이면 평년
        }
      }
      else {
        System.out.println(1); // 4 이면 윤년
      }
    }
    else{
      System.out.println(0); // 아니면 평년
    }
  }
}
