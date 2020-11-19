package level1;

public class KeyPad {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		solution(numbers,hand);
	}
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10; //*
        int right = 12; //#

        for(int n : numbers) {
        	if(n == 1 || n == 4 || n == 7) {
        		answer += "L";
        		left = n;
        	}else if (n == 3 || n == 6 || n == 9) {
        		answer += "R";
        		right = n;
        	}else if (n == 2 || n == 5 || n == 8 || n == 0) {
        		
        		if (distance(left,n)<distance(right,n)) {
        			answer += "L";
        			left = n;
        		}else if (distance(left,n)>distance(right,n)) {
        			answer += "R";
        			right = n;
        		}else {
        			
        			if(hand.equals("left")) {
        				answer += "L";
        				left = n;
        			}else if(hand.equals("right")) {
        				answer += "R";
        				right = n;
        			}
        		}
        		
        	}
        }
        
        System.out.println(answer);
        
        
        return answer;
    }
	
	public static int distance(int handLocation, int n) {
		/*
		 
		 * = 10
		 0 = 11
		 # = 12
		 
		 */
		if(handLocation==0) {
			handLocation = 11;
		}
		
		if(n==0) {
			n = 11;
		}
		
		int distance = 0;
		int num = Math.abs(n - handLocation);
		
		if(num%3==0) {
			distance = num/3;
		}else {
			distance = (num+1)/3 + 1;
		}
		
		return distance;
		
	}

}
