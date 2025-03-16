import java.util.*;
public class Exam1008 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String AB = scanner.nextLine();
    String[] arr = AB.split(" ");
    System.out.println(Double.parseDouble(arr[0])/Double.parseDouble(arr[1]));
  }
}
