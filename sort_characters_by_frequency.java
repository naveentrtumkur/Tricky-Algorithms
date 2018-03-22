// Sort the charcetrs by frequency usinh Java HashMap(Question: Can a HashTree be used to implement this?)

class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        
        while(!map.isEmpty())
        {
        int max = -1;
        char maxChar = 'a';
        for(Map.Entry<Character, Integer> entry :map.entrySet())
        {
            if(entry.getValue() > max){
            max = entry.getValue();
                maxChar = entry.getKey();
            }
            
        }
            while(max-- > 0)
            sb.append(maxChar);
            map.remove(maxChar);
        }
        return sb.toString();
    }
}
