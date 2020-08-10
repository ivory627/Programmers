package level1;

public class ArrayIntoJarisu {

	public static void main(String[] args) {
		int[] answer = solution(1234);
		
		for(int i : answer) {
			System.out.print(i);
		}
		
	}
	
	public static int[] solution(long n) {
		
		String s = n + "";
		int[] answer = new int[s.length()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)(n%10);
			n /= 10;
		}
        		
        return answer;
    }
}
