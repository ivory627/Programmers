package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionDevelopment {

	public static void main(String[] args) {
		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };
		solution(progresses, speeds);
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		List<Integer> result = new ArrayList<Integer>();
		int[] days = new int[progresses.length];//배포까지 걸린 일
		int max = 0;
		int idx = 0;//result index
		for (int i = 0; i < progresses.length; i++) {
			while (progresses[i] < 100) {//작업진도가 100이될때까지
				progresses[i] += speeds[i];//speed를 더해줌
				days[i]++;//일수올림
			}
			int cnt = 0;//배포개수
			if(days[i]>max) {//배포일이 max보다 크면
				max = days[i];
				cnt++;//배포개수올리고
				result.add(cnt);//결과에 배포개수 넣음
				idx++;
			}else {//배포일이 max보다 작으면
				result.set(idx-1, result.get(idx-1)+1);//이전값에서 +1하고 다시 넣어주기
			}
			
		}
		
		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.get(i);
		}

		System.out.println(Arrays.toString(answer));
		return answer;
	}

}
