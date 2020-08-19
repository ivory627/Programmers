package level1;

public class GCDLCM {

	public static void main(String[] args) {
		int[] answer = solution(2,5);
		for(int i : answer) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int n, int m) {
		//최대공약수 구하기 = 유클리드 호제법
		//1. 뺄셈 방식 : 큰 수에서 작은 수를 계속해서 빼나가다 결과값이 0이 나오게 하는 수가 최대 공약수.
		//2. 나눗셈 방식 : 큰 수에서 작은수 를 나누어 나머지가 0일때 작은 수가 최대 공약수.
		// * 나머지가 0이 아니면 큰 수  = 작은 수 , 작은 수 = 나머지 값을 넣어 나누기를 반복
		//최소공배수 구하기 = 두 수를 곱한 후 최대공약수로 나누어준다.
        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        int gcd = 0;
        int lcm = 0;
        //최대공약수
        while(big%small>0) {
        	int tmp = big%small;
        	big = small;
        	small = tmp;
        }
        gcd = small;
        
        //최소공배수
        lcm = (n*m)/gcd;
        
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }

}
