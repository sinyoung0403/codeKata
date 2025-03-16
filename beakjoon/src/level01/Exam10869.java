import java.util.Scanner;
public class Exam10869 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String AB = scanner.nextLine();
    String[] arr = AB.split(" ");
    System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
    System.out.println(Integer.parseInt(arr[0])-Integer.parseInt(arr[1]));
    System.out.println(Integer.parseInt(arr[0])*Integer.parseInt(arr[1]));
    System.out.println(Integer.parseInt(arr[0])/Integer.parseInt(arr[1]));
    System.out.println(Integer.parseInt(arr[0])%Integer.parseInt(arr[1]));
  }
}