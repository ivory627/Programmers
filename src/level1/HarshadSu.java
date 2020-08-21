package level1;

public class HarshadSu {

	public static void main(String[] args) {
		System.out.println(solution(11));
	}
	
	public static boolean solution(int x) {        
        String s = x+"";
        int sum = 0;
        
        for(int i=0; i<s.length(); i++) {
        	sum += s.charAt(i) - '0';
        }
       
        return x%sum==0;
    }
}
