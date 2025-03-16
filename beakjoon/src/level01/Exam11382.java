import java.util.*;
public class Exam11382 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] list = scanner.nextLine().split(" ");
    System.out.println(Long.parseLong(list[0])+Long.parseLong(list[1])+Long.parseLong(list[2]));
  }
}