//Leetcode customised string question to solve and arrange secopnd string similar to the foirst string.

//attempt-1
public class Solution {
    public String customSortString(String S, String T) {
        
        StringBuilder  list = new StringBuilder();
        Set<Character> set = new HashSet<>();
        
        for(int i=0; i < S.length(); i++)
        {
            list.append(S.charAt(i));
            set.add(S.charAt(i));
        }
        
        for(int i=0;i<T.length();i++)
        {
            if(!set.contains(T.charAt(i)))
                list.append(T.charAt(i));
            
        }
        
        return list.toString();//.toString();
    }
}
