// Below is teh solution without using loops/recursion
class Solution {
    public int addDigits(int num) {
    // If the number is less than/equal to 9 return it.
       if(num<=9)
           return num;
        //If the number is divisible by 9, return 9.
        else if(num %9 == 0)
            return 9;
        //Else case would be to return num%9.
        else 
            return num%9;
        
    }
}
