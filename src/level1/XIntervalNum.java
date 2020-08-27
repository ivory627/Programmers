package level1;

public class XIntervalNum {

	public static void main(String[] args) {
		long[] answer = solution(-4,2);
		for(long i : answer) {
			System.out.println(i);
		}
	}
	
	public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        
        for(int i=0; i<n; i++) {
        	answer[i] = num;
        	num+=x;
        }
        return answer;
    }

}
