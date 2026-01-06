class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        // int count =0;
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(ch == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        stack.push(ch);
                    }else{
                        stack.pop();
                    }
                }
                if(ch == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        stack.push(ch);
                    }else{
                        stack.pop();
                    }
                }
                if(ch == '}'){
                    if(stack.isEmpty() || stack.peek() != '{'){
                        stack.push(ch);
                    }else{
                        stack.pop();
                    }
                }
            }
        }
        return stack.size();
    }
}