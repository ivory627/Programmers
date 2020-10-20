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
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i : scoville) {
			pq.add(i);
		}
		
			while (pq.peek() <= K) {
				if (pq.peek() == 0 || pq.size()<2) return -1;
				int num = 0;
				num = pq.poll() + pq.poll() * 2;
				pq.add(num);
				answer++;
			}
			
		System.out.println(answer);

		return answer;
	}

}
