class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i=1; i<food.length; i++) {
            if (food[i]/2 != 0) {
                answer += (String.valueOf(i)).repeat(food[i]/2);
            } 
        }
        
        return answer+"0"+new StringBuilder(answer).reverse().toString();
    }
}