class Solution {
    public boolean solution(String s) {
        for (char a : s.toCharArray()) {
            if (! ((int) a >= 48 && (int) a <= 57)) {
                return false;
            }
        }
        if (s.length() == 4 || s.length() == 6) {
            return true;
        }
        return false;
    }
}