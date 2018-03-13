/*
A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

Example 1:
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.

*/

class Solution {
    public List<Integer> partitionLabels(String S) {
        // Start with the first index, search the entire string to find the last occurence of that character.
        // MaxLen = that last occurence. move to second character & check teh last occurence of that character.
        // If it is less than MaxLen, traverse next character else update the MaxLen.
        
        List<Integer> list = new ArrayList<>();
        int[] alpha = new int[26];
        
        for(int i=0;i<S.length();i++)
            alpha[S.charAt(i) -'a'] = i;
        
        int maxLen =0, lastOccur = 0;
        for(int i=0; i<S.length();i++)
        {
            maxLen = Math.max(maxLen, alpha[S.charAt(i)-'a']);
            
            if( i == maxLen)
            {
                list.add(maxLen - lastOccur +1);
                lastOccur = maxLen +1;
            }
        }
        
        return list;
    
    }
}
