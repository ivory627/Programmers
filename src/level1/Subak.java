package level1;

public class Subak {

	public static void main(String[] args) {
		System.out.println(solution2(5));
	}
	
	public static String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++) {
        	if(i%2!=0) {
        		answer+="수";
        	}else {
        		answer+="박";
        	}
        }
        return answer;
    }
	
	public static String solution2(int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			if(i%2!=0) {
				sb.append("수");
			}else {
				sb.append("박");
			}
		}
		return sb.toString();
	}

}
