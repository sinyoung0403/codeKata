import java.util.*;
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuffer str = new StringBuffer(new String(arr));
        return str.reverse().toString();
    }
}