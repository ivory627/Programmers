import java.util.Calendar;

public class YearOf2016 {

	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(5, 24);
	}

}

class Solution {
	public String solution(int a, int b) {
        String answer = "";
        String[] weeks = {"","SUN","MON","TUE","WED","THU","FRI","SAT"};
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, a - 1);
        cal.set(Calendar.DAY_OF_MONTH, b);
        
        System.out.println(cal.get(Calendar.YEAR)+"³â");
        System.out.println((cal.get(Calendar.MONTH)+1)+"¿ù");
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)+"ÀÏ");
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(weeks[cal.get(Calendar.DAY_OF_WEEK)]);
        
        return answer;
    }
}
