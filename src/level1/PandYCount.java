package level1;

public class PandYCount {

	public static void main(String[] args) {
		System.out.println(solution("ppooyY"));
	}
	
	public static boolean solution(String s) {
		boolean answer = true;
		int pCnt = 0;
		int yCnt = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='p' || s.charAt(i)=='P') {
				pCnt++;
			}
			
			if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
				yCnt++;
			}
		}
		
		if(pCnt!=yCnt) {
			return false;
		}
		
		return answer;
	}

}
