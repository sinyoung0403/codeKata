import java.util.*;
public class Exam2588 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = Integer.parseInt(scanner.nextLine());
    String B = scanner.nextLine();
    for (int i=0; i < 3 ; i++) {
      int unit = Character.getNumericValue(B.charAt(2-i));
      System.out.println(A*unit);
    }
    System.out.println(A*Integer.parseInt(B));
  }
}
