package level1;
import java.util.StringTokenizer;

public class StrangeString {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}
	
	public static String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s," ",true);
        
        while(st.hasMoreTokens()) {
        	String str = st.nextToken();
        	if(str.equals(" ")) {
        		answer += str;
        		continue;
        	}
        	for(int i=0; i<str.length(); i++) {
        		if(i%2==0) {
        			answer += Character.toUpperCase(str.charAt(i));
        		}else {
        			answer += Character.toLowerCase(str.charAt(i));
        		}
        	}
        }
        
        return answer;
    }

}
