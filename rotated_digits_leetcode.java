/*****

X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X. A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number.

Now given a positive number N, how many numbers X from 1 to N are good?

Example:
Input: 10
Output: 4
Explanation: 
There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.

*****/




class Solution {
    public int rotatedDigits(int N) {
        int valid =0;
        int val=0;
       // int i =0;
        for(int i=1;i<=N;i++)
        {
            if(i<10)
        {
                if(i == 2 || i == 5 || i ==6 || i == 9)
                    valid++;
        }
         else if(i>10){
            while(i!=0)
            {
             val = i%10;
            if(val == 2 || val == 5 || val ==6 || val == 9)
                valid++;
            i=i/10;
            }
         }
            else
                continue;
        }
        return valid;
        
    }
}
