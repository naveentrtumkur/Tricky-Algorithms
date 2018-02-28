class Solution {
    public int[] constructRectangle(int area) {
        int L, R;
        int p,q;
        
        p = ((int)Math.sqrt(area));
        q = (int) Math.floor(area/p);
        boolean turn = false;
        while(p< area )
        {
            if(p*q == area)
                break;
            if(!turn)
            {
                p++;
                turn = true;
            }
            
            
        }
        
        while(q<area)
        {
            
            {
                q++;
                turn = false;
            }
        }
         if(p>q && (p*q==area))
             return new int[]{p,q};
        else if(p<q && (p*q==area))
            return new int[]{q,p};
        else if(p==q && (p*q==area))
            return new int[]{q,p};
        else
            return new int[]{-1};
    }
}
