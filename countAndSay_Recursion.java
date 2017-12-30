//Count and say using recursion.

public class Solution {
    public String countAndSay(int n) {
        if(n == 1){
           return "1"; 
        }
        String s = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        char[] sc = s.toCharArray();
        int count = 1;
        for(int i = 1; i <= sc.length; i++){
          if(i == sc.length ||  sc[i] != sc[i - 1]){
             sb.append(count);
             sb.append(sc[i - 1]);  
              count =1;
          }  
            else
          count++;  
        }
        return sb.toString();
    }
}
