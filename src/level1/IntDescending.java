package level1;

import java.util.Arrays;

public class IntDescending {

	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
	
	public static long solution(long n) {
        String s = n + "";
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        String answer = "";
        
        for(int i=arr.length-1; i>=0; i--) {
        	answer += arr[i];
        }
        
        return Long.parseLong(answer);
    }

}
