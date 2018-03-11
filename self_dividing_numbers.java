/*****

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.



**/


class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(i!=0 && i<10 && i%10!=0)
            {
                list.add(i);
            }
            else if(i!=0 && i>10 && i%10!=0)
            {
                int temp =i;
                int k;
                while(temp!=0)
                {
                    if(temp%10==0)
                        break;
                    k = temp %10;
                    if(i%k== 0)
                    {
                        //System.out.println(temp);
                        temp =temp/10;
                        continue;
                    }
                    else
                        break;
                    
                }
                if(temp == 0)
                    list.add(i);
            }
        }
        return list;
        
    }
}
