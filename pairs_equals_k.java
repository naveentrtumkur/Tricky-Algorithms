/* Java implementation of simple method to find count of
pairs with given sum*/
 
import java.util.*;
 
class Solution
{
    // Initialise an array.
    static int arr[] = new int[]{1, 5, 7, -1, 5} ;
     
    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int n, int sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
 
        // Store counts of all elements in map hm
        for (int i=0; i<n; i++){
             
            // initializing value to 0, if key not found
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);
                 
            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int twice_count = 0;
 
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        // A pair (4,2) and if k=6, 2+4 and 4+2 is counted independently.
	for (int i=0; i<n; i++)
        {
            if(hm.get(sum-arr[i]) != null)
                twice_count += hm.get(sum-arr[i]);
 
            // if (arr[i], arr[i]) pair satisfies the condition,
            // then we need to ensure that the count is
            // decreased by one such that the (arr[i], arr[i])
            // pair is not considered
            if (sum-arr[i] == arr[i])
                twice_count--;
		// If it is the same pair of elements,then we would decrement the counters.
        }
 
        // return the half of twice_count
        return twice_count/2; 
    }
 
    // Driver or the main method to test the above function
    public static void main(String[] args) {
         
        int sum = 6;
        System.out.println("Count of pairs is " + 
                            getPairsCount(arr.length,sum));
         
    }
}
