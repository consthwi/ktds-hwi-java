package problem0123;

/**
 * 문제25)
 * 1 부터 1000 중 소수(1과 자신으로만 나눌 수 있는 수)만 출력한다.
 */
public class Problem25 {

	public static boolean isPrime(int num) {
		
		// 1이하는 소수가 아니므로 false 반환
		if(num <= 1) {
			return false;
		}
		
		// 2부터 시작하여 num-1까지의 숫자 중 (1씩 증가) 
		// 나누어떨어지는 수가 있으면 소수가 아니므로 false 반환
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		// 위 조건들에 해당하지 않으면 소수이므로 true 반환
		return true;
	}
	
	public static void main(String[] args) {
		
		// 1부터 1000까지 숫자 중 소수만 출력
		for(int i=1; i<1001; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
}
