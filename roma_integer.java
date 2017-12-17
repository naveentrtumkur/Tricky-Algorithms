//Basic conversion of a roman numeral to an integer value.
//Given a roman numeral, convert it to an integer.

//Input is guaranteed to be within the range from 1 to 3999.

class Solution {
    public int romanToInt(String s) {
        int[] nums = new int[s.length()];
        int sum=0;
        for(int i=0; i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
            }
        }
        //int sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
                sum = sum - nums[i];
            if(nums[i]>=nums[i+1])
                sum = sum + nums[i];
            //else
                //System.out.println("There must be some error in code, so please check again\n");
        }
        sum = sum + nums[nums.length-1];
        return sum;
            }
        }
        



