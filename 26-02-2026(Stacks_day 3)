LeetCode 1047
Remove all adjacent duplicates in a string 
class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }            
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}

LeetCode 150 
Evalauate Reverse Polish Notation 
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                st.push(st.pop() + st.pop());
            } else if (c.equals("-")) {
                int second = st.pop();
                int first = st.pop();
                st.push(first - second);
            } else if (c.equals("*")) {
                st.push(st.pop() * st.pop());
            } else if (c.equals("/")){
                int second = st.pop();
                int first = st.pop(); 
                st.push(first / second); 
            } else {
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
    }
}
