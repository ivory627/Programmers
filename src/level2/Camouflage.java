package level2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		solution(clothes);
	}

	public static int solution(String[][] clothes) {
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			// 옷 종류의 갯수 카운트해서 넣어주기
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		
		//모든 수는 0을 곱하면 0이 되므로 초기화는 1로해주기
		int answer = 1;
		//옷의 종류가 a b c 가 있다면
		//(a종류 갯수+1)*(b종류 갯수+1)*(c종류 갯수+1) -1
		//아무것도 입지않는 경우는 없으므로 1을 빼준다.
		for (int val : map.values()) {
			answer *= (val + 1);
		}
		answer-=1;

		return answer;
	}

}
