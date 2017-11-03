/*************************

Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
We would use HashMap to solve such a scenario.

*****************************

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
