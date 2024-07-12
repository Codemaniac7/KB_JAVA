package week3.피로도;

public class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
        boolean[] visited = new boolean[dungeons.length];
        backtrack(k, visited, n, dungeons, 0);
        return answer;
    }

    public void backtrack( int cur_k,boolean[] visited, int n, int[][] dungeons, int cnt) {
        //basecase
        if(cnt>answer) {
            answer =cnt;
        }

        //recursive call
        for(int i=0; i<n; i++) {
            if (cur_k>=dungeons[i][0] && !visited[i]) {
                visited[i]= true;
                backtrack(cur_k - dungeons[i][1],visited, n,dungeons, cnt+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example dungeons array
        int[][] dungeons = {
                {5, 10},  // {health, fatigue}
                {7, 12},
                {3, 5}
        };

        int k = 10;  // Initial fatigue

        int result = solution.solution(k, dungeons);
        System.out.println("Maximum dungeons explored: " + result);
    }
}
