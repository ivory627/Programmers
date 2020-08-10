package level1;
import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		String[] strings = {"sun","bed","car"};
		String[] answer = solution(strings,1);
		
		for(String s : answer) {
			System.out.print(s+" ");
		}
		
	}
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		//쉽게 정렬하기위해 n번째 문자를 뽑아서 문자열앞에 붙여준다.
		for(int i=0; i<strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}
		Arrays.sort(strings);
		
		//정렬 후 앞 문자열잘라내서 배열에 담아주기
		for(int i=0; i<strings.length; i++) {
			answer[i] = strings[i].substring(1);
		}
		
		
		return answer;
	}

}
