package level1;

public class IntegerSqrt {

	public static void main(String[] args) {
		System.out.println(solution(121));
	}
	
	public static long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        if(n == Math.pow(sqrt,2)) {
        	return (long)(Math.pow(sqrt+1, 2));
        }else {
        	return -1;
        }
    }

}
