class Solution {
    public boolean isValid(String s) {
        String[] arr = s.split("");
        Stack<String> stack = new Stack(); 
        for (int i = 0; i < arr.length; i++){
            String t = arr[i];
            if (t.equals("{") || t.equals("(") || t.equals("[")){
                stack.push(t);
            } else {
                if (stack.size() == 0){
                    return false;
                }
                if (stack.peek().equals("{") && t.equals("}")){
                    stack.pop();
                } else if (stack.peek().equals("[") && t.equals("]")) {
                    stack.pop();
                } else if (stack.peek().equals("(") && t.equals(")")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.size() > 0){
            return false;
        }
        return true;
    }
}