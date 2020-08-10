package level1;

public class StringBasic {
	public static void main(String[] args) {
		System.out.println(solution("12345a"));
	}
	
	public static boolean solution(String s) {
		
		if(s.length()==4 || s.length()==6) {
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(!Character.isDigit(c)) {
					return false;
				}
			}
			return true;
		}else return false;
	}
}
