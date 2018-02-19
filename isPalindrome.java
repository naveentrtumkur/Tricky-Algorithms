// Complete code to find whether a string is palindrome using Java.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] str = A.toCharArray();
        //StringBuilder sb = new StringBuilder();
       /* if(A == null || A.length() ==1)
        {
            System.out.println("No");
            exit(0);
        }
        */
        int p1 = 0, p2 = A.length() -1;
        while(p1<p2)
        {
            str[p1] = A.charAt(p2);
            str[p2] = A.charAt(p1);
            p1++;
            p2--;
        }
        //System.out.println(String.valueOf(str));
        if(A.equals(String.valueOf(str)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


