class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int i;
        for(i=0;i< m-n+1;i++) // m-n+1 because if both strings are null or if both strings have equal characters.
        {
            int j=0;
            for(; j<n;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                    break;//exit from the inner for loop
                
            }
            
            if(j==n)
                return i;//Return the index of i since a substr was found.
            
            
        }
        return -1;
        
    }
}
