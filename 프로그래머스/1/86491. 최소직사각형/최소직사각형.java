class Solution {
    public int solution(int[][] sizes) {
        int x = 0, y = 0;
        for (int[] a : sizes) {
            x = Math.max(x,Math.max(a[0],a[1]));
            y = Math.max(y,Math.min(a[0],a[1]));
        }
        return x * y;
    }
}