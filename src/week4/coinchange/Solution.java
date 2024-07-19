//package week4.coinchange;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class Solution {
//    public int coinChange(int[] coins, int amount) {
//        boolean[] visited = new boolean[amount + 1];
//        Queue<State> queue = new ArrayDeque<State>();
//
//        queue.offer(new State(amount, 0));
//        visited[amount] = true;
//
//        while(!queue.isEmpty()) {
//            State cur = queue.poll();
//            if(cur.amount == 0) {
//                return cur.cnt;
//            }
//            for(int i=0; i<coins.length; i++) {
//                int nextAmount = cur.amount + coins[i];
//                if(nextAmount>=0 &&!visited[nextAmount]) {
//                    queue.offer(new State(nextAmount, cur.cnt+1));
//                    visited[nextAmount] = true;
//                }
//            }
//        }
//    }
//
//    class State {
//        int amount;
//        int cnt;
//    }
//}
