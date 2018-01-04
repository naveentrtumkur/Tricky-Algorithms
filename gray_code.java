class Solution {
    public List<Integer> grayCode(int n) {
        // Gray Code method by analysing the patterns between the sequence of output that we get.
        List<Integer> res = new ArrayList<Integer>();
        res.add(0);
        
        // The logic for this problem is solution would be:-
        //i) first halp would be solution of n-1
        //ii) second half would be n-1 + 2^n-1 in reverse order.
        
        for(int i=0;i<n;i++)
        {
            for(int j=res.size()-1;j>=0;j--)
            {
                res.add( res.get(j) + (1<<i) ); 
            }
        }
        return res;
    }
}
