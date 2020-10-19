package level1;

public class TernaryNumeralSystem {

	public static void main(String[] args) {
		System.out.println(solution(45));
	}
	
	public static int solution(int value){

        String s = "";

        while(value != 0){
        	
        	//3진법 변환
            if( (value % 3) < 10 ) {
                
            	s = (value % 3) + s;
                
            	value /= 3;
            }

        }
        
        
        int res = 0;
        int r = 1;
        //문자열 뒤집은 후 10진법으로
        for(int i=0; i<s.length(); i++) {
        	res += Integer.parseInt(s.charAt(i)+"")*r;
        	r*=3;
        }

        return res;

    }

}
