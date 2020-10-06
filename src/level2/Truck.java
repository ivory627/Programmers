package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Truck {

	public static void main(String[] args) {
		int bl = 2;
		int weight = 10;
		int[] trucks = {7,4,5,6};
		solution(bl,weight,trucks);
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        //시간
		int sec = 0;
		//다리
        Queue<Integer> q = new LinkedList<>();
        //최대로 올라갈 수 있는 트럭 무게
        int sum = 0;
        
        //트럭 수 만큼 반복
        for(int t : truck_weights) {
        	while(true) {
        		//다리에 트럭이 없다면 트럭 올리고 무게 더해주고 시간올리기
        		if(q.isEmpty()) {
        			q.add(t);
        			sum += t;
        			sec++;
        			break;
        			
        			//다리에 트럭이 꽉 찼다면 다리에서 트럭을 빼주고 무게에서도 빼주기
        			//1초에 1칸씩밖에 못가므로 다리길이가 2면 트럭이 최대 2대
        		}else if(q.size()==bridge_length) {
        			sum -= q.poll();
        		}else {
        			//다리에 트럭이 있는데, 꽉 차지 않았을 때
        			//다리가 버틸 수 있는 무게보다 트럭들의 무게가 크다면
        			//시간올려주고 다리에 트럭 대신 0을 넣어준다 (q사이즈를 다리길이와 맞춰주기위함=2번째 조건으로 가서 트럭을 지나가게하기위해)
        			if(sum + t > weight) {
        				sec++;
        				q.add(0);
        				
        				//다리가 버틸 수 있는 무게보다 트럭들의 무게가 작다면
        				//처음과 마찬가지로 다리에 트럭을 올리고 무게 더해주고 시간을 올려준다.
        			}else {
        				q.add(t);
        				sum += t;
        				sec++;
        				break;
        			}
        		}        		
        	}
        }
        System.out.println(sec+bridge_length);
        //트럭이 다리에 진입하고나서 다리를 완전히 지나야하기때문에 시간에 다리길이를 더해주어 return한다.
        return sec+bridge_length;
    }

}
