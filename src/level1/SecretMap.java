package level1;

import java.util.Arrays;

public class SecretMap {

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		solution(n,arr1,arr2);
	}
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] map = new String[n];
        
        for(int i=0; i<n; i++) {
        	//int범위를 넘어가서 런타임에러 ==> Long으로 바꿔주기
//        	map[i] = String.format("%0"+n+"d", Integer.parseInt(Integer.toBinaryString(arr1[i]|arr2[i])));
        	map[i] = String.format("%0"+n+"d", Long.parseLong(Integer.toBinaryString(arr1[i]|arr2[i])));
        }
        System.out.println(Arrays.toString(map));
        for(int i=0; i<map.length; i++) {
        	String m = map[i];
        	String str = "";
        	for(int j=0; j<m.length(); j++) {
        		if(m.charAt(j)=='1') {
        			str += "#";
        		}else {
        			str += " ";
        		}
        	}
        	answer[i] = str;
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }

}
