
public class DusuHab {

	public static void main(String[] args) {
		System.out.println(solution(3,3));
	}
	
	public static long solution(int a, int b) {
		
		long res = 0;
		
		if(a<b) {
			for(int i=a; i<=b; i++) {
				res += i;
			}
		}else {
			for(int i=b; i<=a; i++) {
				res += i;
			}
		}
		return res;
	}

}
