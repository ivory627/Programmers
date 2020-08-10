package level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divisorArray {

	public static void main(String[] args) {
		int[] arr = {1,2,5,6,10,30,20};
		int[] res = solution(arr,10);
		
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i:arr) {
        	if(i%divisor==0) {
        		list.add(i);
        	}
        }
        if(list.size()==0) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[list.size()];
        	for(int i=0; i<list.size(); i++) {
        		answer[i] = list.get(i);
        	}
        	Arrays.sort(answer);        	
        }
        return answer;
        
    }
}
