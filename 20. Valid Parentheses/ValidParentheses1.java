class Solution {
    public boolean isValid(String s) {
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        }
        if (s.charAt(s.length()-1) == '(' || s.charAt(s.length()-1) == '{' || s.charAt(s.length()-1) == '[') {
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
            
    }
}
