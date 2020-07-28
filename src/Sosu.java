
public class Sosu {

	public static void main(String[] args) {
		
		System.out.println("소수의 갯수:"+solutionSecond(10));
		/*
		 * 10 = 2,3,5,7
		 * 5 = 2,3,5
		 */
	}
	
	//숫자를 2부터 자기자신까지  나누어보기
	//나누어떨어지면 소수가 아님.
	public static int solutionFirst(int n) {
        int sosu = 2; //1은 소수가 아니므로 2부터
        int cnt = 0;
        boolean flag = true;
        
        while(sosu<=n) {
        	
        	flag = true;
        	
        	for(int i=2; i<sosu; i++) {
        		if(sosu%i==0) {
        			flag = false;
        			break;
        		}
        		continue;
        	}
        	
        	if(flag==true) {
        		System.out.println(sosu);
        		cnt++;
        	}
        	
        	sosu++;

        }
        

        return cnt;
    }
	
	public static int solutionSecond(int n) {
		int[] arr = new int[n+1];
		int cnt = 0;
		
		//배열 초기화
		for(int i=2; i<=n; i++) {
			arr[i] = i;
		}
		
		for(int i=2; i*i<=n; i++) {
			//이미 0으로 체크된 배수는 확인 X
			if(arr[i]==0)
				continue;
			
			//i를 제외한 i의 배수들을 0으로 체크
			for(int j=i+i; j<=n; j+=i) {
				arr[j] = 0;
			}
			
		}
		
		for(int i=2; i<=n; i++) {
			if(arr[i]!=0) {
				cnt++;
				System.out.println(arr[i]);
			}
		}
		return cnt;
	}

}
