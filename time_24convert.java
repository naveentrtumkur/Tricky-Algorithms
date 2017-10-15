import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        int i=0,len=s.length(),hh,mm,ss;
        char[] str = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        hh = (str[0] -'0') *10 + str[1]-'0';
        mm= (str[3] -'0') *10 + str[4]-'0';
        ss = (str[6] -'0') *10 + str[7]-'0';
        if(str[8]=='P' && str[9]=='M')
        {
            hh += 12;
            if(hh==24)
                hh=0;
        }
        if(str[8]=='A' && str[9]=='M' && hh == 12)
        {
            hh -= 12;
        }
        if(hh<9)
        {
            sb.append(Integer.toString(0));
            sb.append(Integer.toString(hh));
        }
        else
        sb.append(Integer.toString(hh));
        sb.append(":");
        
        if(mm<9)
        {
            sb.append(Integer.toString(0));
            sb.append(Integer.toString(mm));
        }
        else
        sb.append(Integer.toString(mm));
        sb.append(":");
        
        if(ss<9)
        {
            sb.append(Integer.toString(0));
            sb.append(Integer.toString(ss));
        }
        else
        sb.append(Integer.toString(ss));
        //sb.append(:);
        //String s2 = sb;
        return sb.toString();
        //return to_string(hh+":"+mm+":"+ss);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}


