class Solution {
    public String solution(String[] seoul) { 
        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + String.valueOf(i) + "에 있다";
            }
        }
        return "김서방은 없다";
    }
}