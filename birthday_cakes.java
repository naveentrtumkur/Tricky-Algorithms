import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        // Complete this function
        int solution = 0;
        int current = 0;
        int sum = 0;
        for(int i = 0; i < m; i++){
            sum+=s[i];
        }
        if(sum == d) solution++;
        for(int i = m; i < s.length; i++){
            sum = sum - s[current++] + s[i];
            if(sum == d) solution++;
        }
        return solution;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}


