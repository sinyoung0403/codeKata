class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int b = 0;
        for (int i:num_list) {
            a *= i;
        }
        for (int i:num_list) {
            b += i;
        }
        return (a < b * b ? 1 : 0);
    }
}