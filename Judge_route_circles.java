/* Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int hor =0, ver =0;
        
        int len = moves.length();
        for(int i=0; i<len;i++)
        {
            if(moves.charAt(i) == 'U')
                ver += 1;
            else if(moves.charAt(i) == 'D')
                ver -=1;
            else if(moves.charAt(i) == 'L')
                hor -= 1;
            else
                hor +=1;
                
        }
        
        if(hor == 0 && ver == 0)
            return true;
        else
            return false;
        
    }
}
