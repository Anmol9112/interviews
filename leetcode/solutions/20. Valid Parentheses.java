class Solution {
    public boolean isValid(String s) {
      Deque<Character> stack = new ArrayDeque<Character>();
        
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c=='[')
                stack.push(c);
            
            
            if(stack.isEmpty())
                return false;
            
            switch(c){
                case ')':
                    if(stack.peek() == '(' )
                        stack.pop();
                     else
                        return false;
                break;
                    
                case '}':
                    if(stack.peek() == '{')
                        stack.pop();
                     else
                        return false;
                break;
                    
                case ']':
                    if(stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                break;
            }
                
        }
        
       return (stack.isEmpty());
       
        
