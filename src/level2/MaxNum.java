package level2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNum {

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		System.out.println(solution(numbers));
	}
	
	public static String solution(int[] numbers) {
        String answer = "";
        //문자열 리턴을 해줄 스트링배열 생성
        String[] arr = new String[numbers.length];
        
        //int배열 String배열로 변환
        for(int i=0; i<numbers.length; i++) {
        	arr[i] = String.valueOf(numbers[i]);
        }
        
        //내림차순 정렬
        Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
				//오름차순 정렬 (o1+o2).compareTo(o1+o2);
			}
		});
        
        //0값이 중복일경우 ex){0,0,0}
        //답이 000이 나오면 안되므로 첫번째값이 0이면 0을 리턴
        if(arr[0].equals("0")) {
        	return "0";
        }else {
        	//0이 아니면 문자열을 더해준다
        	for(String s : arr) {
        		answer += s;
        	}
        }
        
        
        return answer;
    }

}
