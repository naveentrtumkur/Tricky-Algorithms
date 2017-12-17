/*//This program is used to match valid paranthesis using Java.
I have used stack to implement this program.
- If it's a starting braces push it onto stack.
- If its closiing braces, check stack isn't empty and element at top of stack is starting braces.
- If at final return, if stack isn't empty, return true else return false.
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        //Iterate through the starting for paranthesis matching
        for(int i=0; i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case '(': 
                    stack.push('(');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ')':
                    if(stack.size()==0||stack.pop()!='(')
                        return false;
                    break;
                case '}':
                    if(stack.size()==0||stack.pop()!='{')
                        return false;
                    break;
                case ']':
                    if(stack.size()==0||stack.pop()!='[')
                        return false;
                    break;
            }
        }
            return stack.isEmpty();
        }
    }
