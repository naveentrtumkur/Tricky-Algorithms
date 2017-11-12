/*****
 Find pivot element where sum of left elements 
would be equal to sum of right side elements
*******/

class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n=(int)nums.size();
        vector<int> sums(n+1,0);
        for (int i=1; i<sums.size(); ++i)
            sums[i]=sums[i-1]+nums[i-1];
        for (int i=0; i<sums.size()-1; ++i)
            if (sums[i]==sums[n]-sums[i+1])
                return i;
        return -1;
    }
};
