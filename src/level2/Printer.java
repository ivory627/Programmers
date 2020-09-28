package level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		System.out.println(solution(priorities, 0));
	}
	
	public static int solution(int[] priorities, int location) {
        int cnt = 0;
        //우선순위큐 : 작은 수 부터 우선순위가 높음
        //Collections.reverseOrder()메소드를 사용해 내림차순 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i : priorities) {
        	pq.add(i);
        }
                
        //큐가 빌때까지 반복
        while(!pq.isEmpty()) {
        	for(int i=0; i<priorities.length; i++) {
        		//큐에 정렬된 우선순위가 높은 작업과 원래 배열의 우선순위와 같은지 비교
        		if(pq.peek()==priorities[i]) {
        			//현재 인덱스와 location이 일치하면 cnt리턴
        			if(i==location) {
        				cnt++;
        				return cnt;
        			}
        			//일치하지않으면 큐에서 우선순위가 높은 작업을 빼주고 cnt증가
        			pq.poll();
        			cnt++;
        		}
        	}        	
        }
        
        return cnt;
    }

}
