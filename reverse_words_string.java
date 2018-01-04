//Reverse the words in a string using trime(),Sb, and split.

public class Solution {
    public String reverseWords(String s) {
     
         s = s.trim();
    if(s.length() <= 1)
        return s;
    String[] sArray = s.split(" ");
    int i = 0;
    int j = sArray.length-1;
    while(i < j){
        String temp = sArray[i].trim();
        sArray[i] = sArray[j].trim();
        sArray[j] = temp;
        
        i++;
        j--;
    }
    StringBuilder str = new StringBuilder();
    
    for(int k=0; k < sArray.length; k++){
        if(sArray[k].length() > 0)
            str.append(sArray[k] + " ");
    }
    
    return str.toString().trim();

    }
}
