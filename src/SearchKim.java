
public class SearchKim {

	public static void main(String[] args) {
		String[] seoul = {"Jane", "Park", "Kim"};
		System.out.println(solution(seoul));
	}
	
	public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) {
        		answer = "김서방은 "+i+"에 있다";
        		break;
        	}
        }
        return answer;
    }
}
