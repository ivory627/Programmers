package level2;

public class Country124 {

	public static void main(String[] args) {
		int n = 10;
		solution(n);
	}
	
	public static String solution(int n) {
        int nmg = 0;
        //시간초과로 통과하지 못하여 StringBuilder사용
        StringBuilder sb = new StringBuilder();
        
        while(n>0) {
        	//1,2,4 숫자가 3개이므로 3으로나눠서 규칙을 찾는다.
        	nmg = n%3;
        	n = n/3;
        	
        	//3%3=0 나머지가 0일때
        	//124나라는 3이 없으므로 4로 치환
        	//몫을 -1해주고 위와 같은 과정을 거친다
        	if(nmg==0) {
        		nmg = 4;
        		n -= 1;
        	}
        	
        	//연산의 결과값은 뒤로 붙이기
        	sb.insert(0, nmg);
        }
        System.out.println(sb);
        
        //StringBuilder메소드
        //append() : 문자열 데이터 끝에 문자의 형태로 추가
        //insert() : 첫번째 인자로 삽입될 위치 (0이 맨 앞을 의미 문자가 삽입될 위치), 두번째 인자 삽입될 문자

                
        return sb.toString();
    }

}
