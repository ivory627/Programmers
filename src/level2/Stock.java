package level2;

import java.util.Arrays;

public class Stock {

	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(solution(prices));
		
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        //가격이 떨어지지 않는 기간 (초)
        int sec = 0;
        
        //다음 숫자들과 비교하여 주식이 떨어지는지 파악
        for(int i=0; i<prices.length; i++) {
        	for(int j=i+1; j<prices.length; j++) {
        		//주식이 같거나 올랐다면
        		if(prices[i]<=prices[j]) {
        			//초 증가
        			sec++;
        		//주식이 떨어졌다면
        		}else if(prices[i]>prices[j]) {
        			//1초간 떨어졌기 때문에 1초 증가 후 반복문을 빠져나온다
        			sec++;
        			break;
        		}
        	}
        	answer[i] = sec;
        	//초 수를 다시 초기화
        	sec = 0;
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

}
