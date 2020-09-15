package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
		solution(numbers);
	}
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        int n = numbers.length;
        int r = 2;
        boolean[] visited = new boolean[n];
        comb(numbers, visited, 0, n, r);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	static void comb(int[] numbers, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            cal(numbers, visited, n);
            return;
        }
        
        if (depth == n) {
            return;
        }

        visited[depth] = true;
        comb(numbers, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        comb(numbers, visited, depth + 1, n, r);
    }
	
	static void cal(int[] arr, boolean[] visited, int n){
	    int num = 0;
		for (int i = 0; i < n; i++) {
            if (visited[i]) {
            	num += arr[i];
            }
        }
		if(!list.contains(num)) {
	         list.add(num);
	      }
		
	}
	
	

}
