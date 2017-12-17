// In this method we will flip the lower case or LSB bits and increment the cpunter
// This process is repeated till n!=0;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        // This trick uses the cocnept of flipping th eLSB 1-bit values and incrementing the counter value.
        while(n!=0)
        {
            count++;
            n= n&(n-1);
        }
        return count;
    }
}
