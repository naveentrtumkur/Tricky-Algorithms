class Solution {
public:
    int hammingDistance(int x, int y) {
        
        long int res,count=0;
        //int x=00000001;
        long int x1=1;
        res = x^y;
        //cout << res;
        while(res)
        { 
            //unsigned int t=res&x1;
            //cout << t;
            if((res&1) == 1 )
                //&& ((res&1)!=1))
                count++;
            //if((y&1)==1 && ((res&1)!=1))
                //count++;
            res= res >> 1;
            //y= y >> 1;
        }
        //int t= 3&1;
        //cout<< t;
        return count;
    }
};
