// This program can also be stored by storing count values in a hashMap and then
// traversing through hashmap to find the maximum occuring character. 
//maximum occurring character in a string
 
public class solution
{
    // final would make a variable value as constant.
    final int ASCII_SIZE = 256;
    char getMaxOccuringChar(String str)
    {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];
      
        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;
      
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
      
        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
      
        return result;
    }
     
    // Main function declared here.
    public static void main(String[] args)
    {
        String str = "sample string";
        System.out.println("Max occurring character is " +
                            getMaxOccuringChar(str));
    }
}
