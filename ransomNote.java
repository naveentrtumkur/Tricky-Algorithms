/****************
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
************/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mapr = new HashMap<Character, Integer>();
        Map<Character,Integer> mapm = new HashMap<Character, Integer>();
        
        for(int i=0;i<ransomNote.length();i++)
        {
            if(!mapr.containsKey(ransomNote.charAt(i)))
            {
                mapr.put(ransomNote.charAt(i),1);
            }
            else if(mapr.get(ransomNote.charAt(i))>0)
            {
                mapr.put(ransomNote.charAt(i), mapr.get(ransomNote.charAt(i)) + 1);
            }
        }
        
        for(int i=0;i<magazine.length();i++)
        {
            if(!mapm.containsKey(magazine.charAt(i)))
            {
                mapm.put(magazine.charAt(i),1);
            }
            else if(mapm.get(magazine.charAt(i))>0)
            {
                mapm.put(magazine.charAt(i),mapm.get(magazine.charAt(i)) + 1);
            }
        }
        
        for(Map.Entry<Character,Integer> entry : mapr.entrySet())
        {
            Character key = entry.getKey();
            Integer val = entry.getValue();
            if(!mapm.containsKey(key) || (mapm.get(key)<val))
               return false;
        }
        
        return true;
    }
}
