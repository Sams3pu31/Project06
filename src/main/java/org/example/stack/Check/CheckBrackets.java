package org.example.stack.Check;

import java.util.Stack;

public class CheckBrackets {
    public static boolean isValid(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(' ||
                    c == ']' && !stack.isEmpty() && stack.peek() == '[' ||
                    c == '}' && !stack.isEmpty() && stack.peek() == '{') {stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }}