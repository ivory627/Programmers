package level1;

public class GymClothes {

	public static void main(String[] args) {
		int n = 3;
		int[] lost = { 3 };
		int[] reserve = { 1 };
		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		// 전체학생수 - 잃어버린 학생 수
		int answer = n - lost.length;
		
		// 잃어버린학생 = 여벌이있는 학생이라면
		// 다른사람에게 빌려줄순 없지만 수업에 참여 가능하므로
		// 임의로 reserve와 lost에-1을 지정하고 answer에 +1해준다.
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					reserve[j] = -1;
					lost[i] = -1;
					answer++;
				}
			}
		}
		
		//잃어버린 학생의 앞뒤 번호를 확인하여
		//빌려줄수 있으면 answer+1을 해주고 중복하여 빌려줄 수 없으니 임의로 -1을 지정한다.
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i] == reserve[j]+1 || lost[i] == reserve[j]-1) {
        			answer++;
        			reserve[j] = -1;
        			break;
        		}
        	}
        }
		return answer;
	}

}
