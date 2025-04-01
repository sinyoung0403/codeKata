import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ",-1);
        
        for (int i = 0; i < arr.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < arr[i].length(); j++) { 
                char ch = arr[i].charAt(j);
                if (j % 2 == 0) { 
                    word.append(Character.toUpperCase(ch)); 
                } else { 
                    word.append(Character.toLowerCase(ch)); 
                }
            }
            answer.append(word);
            if (i < arr.length - 1) { answer.append(" "); } 
        }
        return answer.toString();
    }
}
