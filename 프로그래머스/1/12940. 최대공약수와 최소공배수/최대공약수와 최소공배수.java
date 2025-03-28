class Solution {
    public int[] solution(int n, int m) {
        int[] arr = new int[2];
        for (int i = 1; i <= Math.max(n,m); i++ ) {
            if ( n % i == 0 && m % i == 0) {
                arr[0] = i;
            }
        }
        arr[1]  = (n*m) / arr[0];
        return arr;
    }
}
