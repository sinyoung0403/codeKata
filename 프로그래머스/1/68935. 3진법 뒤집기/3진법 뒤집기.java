import java.util.*;
import static java.lang.Integer.parseInt;
class Solution {
  public static int solution(int n) {
    return parseInt(new StringBuffer(Integer.toString(n,3)).reverse().toString(),3);
  }
}
