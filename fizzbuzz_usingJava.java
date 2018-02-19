
// Fizzbuzz program from 1 to n.
import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> out = new ArrayList<String>();
        // Traverse from 1 to n and return th eappropriate string representation of numbers.
        
        for( int i=1; i<=n ; i++)
        {
            if(i%3 == 0)
            {
                if(i%5 == 0)
                {
                    out.add("FizzBuzz");
                }
                else
                    out.add("Fizz");
            }
            else if(i%5 == 0)
            {
                out.add("Buzz");
            }
            else
                out.add(Integer.toString(i));
        }
        return out;
        
    }
}
