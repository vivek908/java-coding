import java.util.Stack;

public class BalancedParentheses {

    // Function to check if parentheses are balanced
    static boolean areParenthesesBalanced(String expression) {
        // Create a stack to store opening parentheses
        Stack<Character> stack = new Stack<>();

        // Traverse the expression
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            // If current character is an opening parenthesis, push it onto the stack
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            }
            // If current character is a closing parenthesis
            else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                // If the stack is empty, parentheses are not balanced
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element from the stack
                char topChar = stack.pop();
                
                // Check if the popped parenthesis matches the current closing parenthesis
                if ((currentChar == ')' && topChar != '(') ||
                    (currentChar == ']' && topChar != '[') ||
                    (currentChar == '}' && topChar != '{')) {
                    return false;
                }
            }
        }

        // If the stack is empty, parentheses are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test the function with an example expression
        String expression = "{[()]()}";
        if (areParenthesesBalanced(expression)) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are not balanced.");
        }
    }
}
