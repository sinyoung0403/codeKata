
class Solution {
    public int solution(int a, int b) {
        String answer = String.valueOf(a) + String.valueOf(b);
        return Math.max(2*a*b, Integer.parseInt(answer));
    }
}