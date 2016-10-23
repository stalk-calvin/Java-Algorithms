public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('||
                s.charAt(i) == '{'||
                s.charAt(i) == '['
            ) {
                brackets.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && (brackets.isEmpty()||brackets.pop() != '(')) { 
                return false;
            } else if (s.charAt(i) == '}' && (brackets.isEmpty()||brackets.pop() != '{')) { 
                return false;
            } else if (s.charAt(i) == ']' && (brackets.isEmpty()||brackets.pop() != '[')) {
                return false;
            }
        }
        return (brackets.size() == 0);
    }
}
