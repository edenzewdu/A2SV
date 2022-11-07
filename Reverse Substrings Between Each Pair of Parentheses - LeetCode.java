class Solution {
    public String reverseParentheses(String s) {
        Deque<StringBuilder> stack = new ArrayDeque<>();
        // In case the first char is NOT '(', need an empty StringBuilder.
        stack.push(new StringBuilder());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // need a new StringBuilder to save substring in brackets pair
                stack.push(new StringBuilder());
            } else if (s.charAt(i) == ')') {
                // found a matched brackets pair and reverse the substring between them.
                StringBuilder reverse = stack.pop().reverse();
                stack.peek().append(reverse);
            } else {
                // append the char to the last StringBuilder.
                stack.peek().append(s.charAt(i));
            }
        }
        return stack.peek().toString();
    }
}