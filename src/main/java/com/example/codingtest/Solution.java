package com.example.codingtest;

import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> s = new Stack<>();
        int answer = 0;
        int i=0;
        for(int n : moves) {
            for(int j=0;j<board.length;j++) {
                if(board[j][n-1] != 0) {
                    if(s.empty()) {
                        s.push(board[j][n-1]);
                        board[j][n-1] = 0;
                        break;
                    }
                    else {
                        // System.out.print("스택위값:"+ s.peek() + " /  ");
                        // System.out.println("인형:"+ board[j][n-1]);
                        if(s.peek() == board[j][n-1]) {
                            s.pop();
                            answer++;
                            break;
                        }
                        else {
                            s.push(board[j][n-1]);
                            board[j][n-1] = 0;
                            break;
                        }
                    }
                }
            }
        }
        answer = answer *2;
        return answer;
    }
}