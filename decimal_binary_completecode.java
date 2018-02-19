// Complete code to convert decimal to binary value.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int nums;
        Scanner sc = new Scanner(System.in);
        nums = sc.nextInt();
        if(nums == 0)
            System.out.println(nums);
        StringBuffer sb = new StringBuffer();
        // Iterate by converting num to appropriate binary value.
        while(nums!=0)
        {
            sb.append(nums%2);
            nums = nums/2;
        }
        System.out.println(sb.reverse().toString());
    }
}
