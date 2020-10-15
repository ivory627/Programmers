package level2;

public class MinMax {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		solution(s);
	}
	
	public static String solution(String s) {
        String answer = "";
        
        //공백으로 잘라서 배열에 넣기
        String[] strings = s.split(" ");
        //int배열 생성
        int[] nums = new int[strings.length];
        
        //String->int 변환
        for(int i=0; i<strings.length; i++) {
        	nums[i] = Integer.parseInt(strings[i]);
        }

        //최소 최대 비교값 초기화
        int min = nums[0];
        int max = nums[0];
        
        for(int i=0; i<nums.length; i++) {
        	//최소값
        	if(min>nums[i]) {
        		min = nums[i];
        	}
        	//최대값
        	if(max<nums[i]) {
        		max = nums[i];
        	}
        }
        
        answer = min +" "+ max;
        System.out.println(answer);

        return answer;
    }

}
