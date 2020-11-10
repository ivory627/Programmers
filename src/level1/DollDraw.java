package level1;

import java.util.Stack;

public class DollDraw { //크레인인형뽑기

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		solution(board,moves);
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        //바구니
        Stack<Integer> stack = new Stack<>();
        
        //크레인 작동한만큼 반복
        for(int move : moves) {
        	for(int i=0; i<board.length; i++) {
        		//2차원배열의 y축만 검사해야하기때문에 x축은 고정
        		//moves가 1~30이므로 move-1로 index값을 0으로 맞춰준다.
        		//칸이 0이 아니라면 , 즉 인형이 있다면
        		if(board[i][move-1]!=0) {
        			//바구니에 있는 인형과 칸에 있는 인형을 비교하여 같다면
        			if(!stack.empty() && stack.peek()==board[i][move-1]) {
        				//인형을없애준다.
        				stack.pop();
        				//인형이 2개가 터지는것이므로 +2
        				answer+=2;
        			}else {
        				//바구니에 있는 인형과 칸에 있는 인형을 비교하여 같지않다면
        				//바구니에 인형을 넣어준다.
        				stack.push(board[i][move-1]);
        			}
        			//칸에 있는 인형을 바구니에 넣었거나 사라졌으므로 0으로 초기화
        			board[i][move-1] = 0;
        			break;
        		}
        	}
        }
        
        System.out.println(answer);
        return answer;
    }

}
