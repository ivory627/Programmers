package level2;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		solution(citations);
	}
	
	public static int solution(int[] citations) {
        int answer = 0;
        //h번 이상 인용된 논문이 h편 이상이고 나머지가 h번 이하인 h의 최댓값을 구하므로
        //정렬 후 앞에서부터 검사하여 처음 h-index가 성립한 순간을 리턴
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++) {
        	//h를 줄여나가며 검사
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
