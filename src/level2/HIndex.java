package level2;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		solution(citations);
	}
	
	public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++) {
        	int h = citations.length-i;
        	if(citations[i]>=h) {
        		answer = h;
        		break;
        	}
        }
        
        System.out.println(answer);
        
        return answer;
    }

}
