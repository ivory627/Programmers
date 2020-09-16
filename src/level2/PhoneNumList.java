package level2;

import java.util.Arrays;

public class PhoneNumList {

	public static void main(String[] args) {
		String[] phone_book = {"12", "123", "1235", "567", "88"};
		System.out.println(solution2(phone_book));
	}
	
	//이중 반복문으로 비교하여 결과값 반환
	public static boolean solution(String[] phone_book) {
        
        for(int i=0; i<phone_book.length-1; i++) {
        	//고정값 1이아닌 i+1을 해줌으로써 지나왔던것을 생략해준다
        	for(int j=i+1; j<phone_book.length; j++) {
        		//두가지 경우를 비교
        		if(phone_book[i].startsWith(phone_book[j])) return false;
        		if(phone_book[j].startsWith(phone_book[i])) return false;
        	}
        }
		return true;
        
    }
	
	//정렬 후 다음값과 비교하기 -> 속도가 빨라진다
	public static boolean solution2(String[] phone_book) {
        
		Arrays.sort(phone_book);
        for(int i=0; i<phone_book.length-1; i++) {
        	if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
		return true;
        
    }

}
