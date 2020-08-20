package level1;

public class Collatz {

	public static void main(String[] args) {
		System.out.println(solution(626331));
	}
	
	public static int solution(long num) {
        int cnt = 0;
        
        while(num!=1) {
        	if(num%2==0) {
        		num/=2;
        		cnt++;
        	}else {
        		num = num * 3 + 1;
        		cnt++;
        	}
        	
        	if(cnt==500) {
        		return -1;
        	}
        }
        
        return cnt;
    }

}
