import java.util.Stack;

public class prefix_to_postfix {
    public static String prefixtopostfix(String s){
        Stack<String> st = new Stack<>();

        // Scan the expression from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            // Ignore spaces
            if (Character.isWhitespace(ch)) {
                continue;
            }

            // 1. If character is an operand, push to stack
            if (Character.isLetterOrDigit(ch)) {
                st.push(String.valueOf(ch));
            } 
            // 2. If character is an operator
            else {
                // Pop the top two operands
                // Note: First popped is left operand, second popped is right operand
                String op1 = st.pop(); // Left operand
                String op2 = st.pop(); // Right operand

                // Combine into postfix format: op1 + op2 + operator
                String combined = op1 + op2 + ch;

                // Push back to stack
                st.push(combined);
            }
        }

        // The remaining element in stack is the complete Postfix expression
        return st.peek();
    }
    public static void main(String[] args) {
        String s="/-AB*+DEF";
        String ans=prefixtopostfix(s);
        System.out.println(ans);
    }
}
