package week2.올바른괄호;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> stack = new ArrayDeque<>();

        if (s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;


        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        answer = stack.isEmpty();
        return answer;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "(())()";
        boolean start = s.solution(s1);
    }
}
