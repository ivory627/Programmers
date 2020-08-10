package level1;
import java.util.Arrays;

public class Knum {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer2 = {};
		
		answer2 = solution(array,commands);
		
		for(int i : answer2) {
			System.out.print(i);
		}
		
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] array2 = {};
		
		for(int i=0; i<commands.length; i++) {
			int idx1 = commands[i][0];
			int idx2 = commands[i][1];
			int k = commands[i][2];
				
			array2 = Arrays.copyOfRange(array, idx1-1, idx2);
			Arrays.sort(array2);				
			answer[i] = array2[k-1];
		}
		
		return answer;
	}

}
