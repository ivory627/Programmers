package level1;

public class DeleteMin {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		int[] answer = solution(arr);
		for(int i : answer) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int[] arr) {
        
        if(arr.length==1) {
        	int[] answer = {-1};
        	return answer;
        }
        
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
        	if(min>arr[i]) {
        		min = arr[i];
        	}
        }
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
        	if(min==arr[i]) {
        		continue;
        	}
        	answer[idx++] = arr[i];      		
        }
        
        return answer;
    }

}
