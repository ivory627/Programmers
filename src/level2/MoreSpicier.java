package level2;

import java.util.PriorityQueue;

public class MoreSpicier {

	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
		solution(scoville, K);
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		//우선순위큐 생성 -> heap자료구조 형태로 저장
		//우선순위가 높은 순으로 정렬
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i : scoville) {
			pq.add(i);
		}
			//첫번째 값(최소 값)이 스코빌지수를 넘을때까지 반복
			while (pq.peek() <= K) {
				//우선순위큐에 값이 2개 미만이면 스코빌지수를 만들수없으므로 -1리턴
				if (pq.size()<2) return -1;
				int num = 0;
				num = pq.poll() + pq.poll() * 2;
				pq.add(num);
				answer++;
			}
			
		System.out.println(answer);

		return answer;
	}

}
