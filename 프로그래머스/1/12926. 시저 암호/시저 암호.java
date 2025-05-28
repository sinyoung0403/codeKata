class Solution {
    public String solution(String s, int n) {
        char[] arrCh = s.toCharArray();
        for (int i = 0; i < arrCh.length; i++) {
            char c = arrCh[i];
            if (c >= 'a' && c <= 'z') {
                arrCh[i] = (char)((c - 'a' + n) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                arrCh[i] = (char)((c - 'A' + n) % 26 + 'A');
            } else {
                arrCh[i] = c;
            }
        }
        return String.valueOf(arrCh);
    }
}
