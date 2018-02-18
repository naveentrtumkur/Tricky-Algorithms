public class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[256]; //  A character array to store all 256 characters.
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
