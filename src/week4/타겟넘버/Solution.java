package week4.타겟넘버;

public class Solution {
    int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        backtrack(0, 0, numbers, target);
        return answer;
    }
    void backtrack(int cur, int idx, int[] numbers, int target) {
        //basecase
        if (target == cur) {
            answer++;
        }
        //recursive call
        backtrack(cur + numbers[idx], idx+1, numbers, target);
        backtrack(cur - numbers[idx], idx+1, numbers, target);
    }
}
