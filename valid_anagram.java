// To check whether two strings are anagrams.

// Use an int array corresponding to the 26 alphabets.

For first string increment the count of respective char and second string, decrement the counter.

If counter value goes below  0 return false.
Else at the end return true.

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counter = new int[26];
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i<s.length();i++)
        {
            counter[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++)
        {
            counter[t.charAt(j)-'a']--;
            
            if(counter[t.charAt(j)-'a'] < 0)
                return false;
        }
        return true;
    }
}
