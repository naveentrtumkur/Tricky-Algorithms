//Leetcode customised string question to solve and arrange secopnd string similar to the foirst string.

class Solution {
    public String customSortString(String S, String T) {
        
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int[] count = new int[26];
        
        for(int i=0;i<T.length();i++)
        {
            count[T.charAt(i) - 'a']++;
            
            //set.add(T.charAt(i));
        }
        
        //Parse the first string and construct the string buffer
        for(int i=0;i<S.length();i++)
        {
            if(count[S.charAt(i)-'a'] > 0)
            {
                while(count[S.charAt(i)-'a']-- > 0)
                    sb.append(S.charAt(i));
                set.add(S.charAt(i));
            }
        }
        
        //Add the remaining T string characters to the SB.
        for(int i=0;i<T.length();i++)
        {
            //System.out.println("char="+T.charAt(i));
            if(!set.contains(T.charAt(i)))
            {
                //System.out.println("Inside if="+T.charAt(i));
                sb.append(T.charAt(i));
            }
        }
        
        return sb.toString();
        
        }
    }
