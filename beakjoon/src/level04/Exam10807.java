package level04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Exam10807 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    // 리스트 추가.
    for (int i = 0; i < num; i++) {
      list.add(sc.nextInt());
    }

    int find = sc.nextInt();
    AtomicInteger result = new AtomicInteger(0);
    list.forEach(a -> {
      if (a == find) {
        result.getAndIncrement();
      }
    });
    System.out.println(result);
  }
}
