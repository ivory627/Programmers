package level1;

public class StringtoInt {

	public static void main(String[] args) {
		System.out.println(solution("+1234"));
	}
	
	public static int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}

}
