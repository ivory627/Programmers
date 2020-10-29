package level2;

import java.util.Arrays;

public class Carpet {

	public static void main(String[] args) {
		solution(10,2);
	}
	
	//카펫 둘레(brown) 구하기 : 2x + 2y -4(모서리 겹치는 부분)
	//식을 정리하면  x + y = (brown + 4) / 2
	//카펫 안쪽 넓이(yellow) 구하기 : (x-2)*(y-2) -> 가로,세로 각각 겹치는 부분빼서 곱하기
	//조건중 yellow는 1이상이기 때문에 y>=3, 가로 세로가 같거나 가로가 더 크므로 x>=y
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x, y = 0;
        int sum = (brown+4)/2;
        
        for(y=3; y<=sum; y++) {
        	x = sum - y;
        	if(x<y) break;
        	
        	if((x-2)*(y-2)==yellow) {
        		answer[0] = x;
        		answer[1] = y;
        		break;
        	}
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }

}