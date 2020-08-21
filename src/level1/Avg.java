package level1;

public class Avg {

	public static void main(String[] args) {
		int[] arr = {5,5};
		System.out.println(solution(arr));
	}
	
	public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i : arr) {
        	sum += i;
        }
        
        answer = sum / arr.length;
        return answer;
    }

}
