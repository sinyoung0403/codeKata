import java.util.*;
import static java.lang.Integer.parseInt;
class Solution {
  public static int solution(int n) {
    return parseInt(String.valueOf(new StringBuffer(Integer.toString(n,3)).reverse()),3);
  }
}