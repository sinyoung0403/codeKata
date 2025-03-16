import java.util.*;
public class Exam1000 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String AB = scanner.nextLine();
    String[] arr = AB.split(" ");
    System.out.println(Integer.valueOf(arr[0])+Integer.valueOf(arr[1]));
  }
}
