import java.util.Stack;
import java.util.Scanner;

public class Parenthesesbal {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            boolean repeat = true;
            while (repeat) {
                System.out.print("Enter the number of test cases: ");
                int n = scn.nextInt();
                scn.nextLine(); 
                String[] results = new String[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter the set of parentheses: "); 
                    String parentheses = scn.nextLine();
                    if (isBalanced(parentheses)) {
                        results[i] = "BALANCED";    
                    } else {
                        results[i] = "NOT BALANCED";  
                    }
                }
                for (String result : results) {
                    System.out.println(result);   
                }
                
            }
        }
    }

    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if (c == '(' || c == '{') {
                stack.push(c); 
            } else if (c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop(); 
                if ((c == ')' && top != '(') || (c == '}' && top != '{')) {
                    return false; 
                }
            }
        }
        return stack.isEmpty(); 
    }
}