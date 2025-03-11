public class Exam87390 {
  public int[] solution(int n, long left, long right) {
    int[] arr = new int[(int) (right-left+1)];
    int index = 0;
    for (long i = left; i <= right; i++) {
      // 나머지는 실제 자리 값
      int a = (int) (i % n);
      // 몫은 반복수
      int b = (int) (i / n);
      arr[index] = Math.max(a+1, b+1);
      index ++;
    }
    return arr;
  }
}
