package level2;

public class Square {

	public static void main(String[] args) {
		int[][] board = {{0,0,1,1},{1,1,1,1}};
		solution(board);
	}
	
	public static int solution(int[][] board) {
		int answer = 0;
		for(int i=0; i<board.length-1; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j]==board[i+1][j]) {
					answer += board[i][j];
				}
			}
		}
		System.out.println(answer);
		return answer;
	}

}
