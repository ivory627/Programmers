package level1;

import java.util.ArrayList;
import java.util.List;

public class MathTest {

	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		int[] answer = solution(answers);
		for(int i : answer) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = {0, 0, 0};
        
        for(int i=0; i<answers.length; i++) {
        	if(one[i%one.length]==answers[i]) {
        		cnt[0]++;
        	}
        	
        	if(two[i%two.length]==answers[i]) {
        		cnt[1]++;
        	}
        	
        	if(three[i%three.length]==answers[i]) {
        		cnt[2]++;
        	}
        }
        
        int highest = cnt[0];
        for(int i=0; i<cnt.length; i++) {
        	if(highest<cnt[i]) {
        		highest = cnt[i];
        	}
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<cnt.length; i++) {
        	if(highest==cnt[i]) {
        		list.add(i);
        	}
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i)+1;
        }
        
        
        return answer;
    }

}
