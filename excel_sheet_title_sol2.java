// Convert a given excel sheet number to appropriate name title and return
// the accurate result.
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.append((char)('A' + n % 26));
            n /= 26;
        }
        result.reverse();
        return (result.toString());
    }
}
