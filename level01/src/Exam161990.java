public class Exam161990 {
  class Solution {
    public int[] solution(String[] wallpaper) {
      int minX = 50;
      int maxX = 0;
      int minY = 50;
      int maxY = 0;

      for (int i=0; i < wallpaper.length; i++){
        if (wallpaper[i].contains("#")) {
          for (int j=0; j < wallpaper[i].length(); j++){
            if(wallpaper[i].charAt(j)=='#'){
              minX = Math.min(minX,j);
              minY = Math.min(minY,i);
              maxX = Math.max(maxX,j);
              maxY = Math.max(maxY,i);
            }

          }
        }
      }
      int answer[] = {minY,minX,maxY+1,maxX+1};
      return answer;
    }
  }
}
