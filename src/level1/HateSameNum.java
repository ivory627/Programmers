package level1;
import java.util.ArrayList;
import java.util.List;

public class HateSameNum {

	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1, 1};
		int[] answer = solution(arr);
		
		for(int i : answer) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length-1; i++) {
        	
        	if(arr[i] == arr[i+1]) {
        		continue;
        	}else {
        		list.add(arr[i]);
        	}
        	
        }
        
        list.add(arr[arr.length-1]);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

}
