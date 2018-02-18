class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];
        
        //If the string lengths are unequal, then return false.
        if(s.length() != t.length())
            return false;
        
        // Parse the s string and increment the counter values.
        for(int i=0;i<s.length();i++)
        {
            alpha[s.charAt(i) -'a']++;
        }
        
        // Parse the t string and decrement the counter values.
        // If the counter value is less than zero, return false.
        
        for( int j=0;j<t.length();j++)
        {
            alpha[t.charAt(j)-'a']--;
            
            if(alpha[t.charAt(j) -'a'] < 0)
                return false;
        }
        
        // If all the cases have gone through successfully, return true.
        return true;
    }
}
