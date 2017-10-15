import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      Map<Character,Integer> map = new HashMap<>();
        int count =0;
        StringBuilder sb = new StringBuilder();
        for(Character c:first.toCharArray())
        {
            if(!map.containsKey(c))
            {
                map.put(c,1);
                   
                    sb.append(c);
            }
            else
                map.put(c,map.get(c)+1);
          }
        for(Character c:second.toCharArray())
        {
            if(!map.containsKey(c))
            {
                map.put(c,1);
            sb.append(c);
        }
            else
                map.put(c,map.get(c)+1);
          }
        
        for(int i=0;i<sb.length();i++)
        {
            //System.out.println("char="+map.get(sb.charAt(i)));
            //system.out.println("char=",map.get(sb.charAt(i)));
            if((map.get(sb.charAt(i))%2)!=0)
               {
                 count++;
               }
        }
               return count;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}


