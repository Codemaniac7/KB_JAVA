package week3.permutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        boolean[] visited = new boolean[nums.length];
        backtrack(new ArrayList<>(), nums, visited, result);
        return result;
    }
    // 순열을 만들어서 result에 추가하는 코드
    void backtrack(List<Integer> curr, int[] nums , boolean[] visited, List<List<Integer>> result) {
        //basecase
        if(curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        //recursive call
        for(int i = 0 ; i < nums.length ; i++) {
            if (visited[i]) continue;

            curr.add(nums[i]);
            visited[i] = true;
            backtrack(curr, nums,visited, result);
            curr.remove(curr.size()-1);
            visited[i]= false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums =     {1,2,3,4};
        List<List<Integer>> permutations = solution.permute(nums);

        for(List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
