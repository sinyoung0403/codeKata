package level03;

import java.util.*;
public class Exam2739 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    for (int i=1;i<10; i++){
      System.out.printf("%d * %d = %d\n",A,i,A*i);
    }
  }
}
