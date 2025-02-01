package problem0123;

/**
 * 문제4)
 * 1부터 10000 사이에 몇 개의 소수가 있는지 출력하는 메서드 생성 및 호출
 */
public class Problem04 {
	
	/**
	 * 파라미터가 소수인지 판별하는 메서드
	 * @param num 사용자가 입력하는 숫자
	 * @return 소수이면 true, 그렇지 않으면 false
	 */
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
		
		// 파라미터의 *제곱근 정수까지 루프 진행 (연산 최소화)
		// => 루프 내 나누어 떨어지는 수가 있으면 소수가 아님
//		for(int i=2; i<Math.sqrt(num); i++) {
//			if(num % i == 0) {
//				return false;
//			}
//		}
		
		return true;
	}
	
	/**
	 * isPrime을 루프하여 카운트를 1씩 증가시키는 메서드
	 * @param userInput 사용자가 입력한 수까지 소수의 개수를 카운팅
	 * @return 소수의 개수
	 */
	public static int countIsPrime(int userInput) {
		int count = 0;
		
		for(int i=0; i<=userInput; i++) {
			boolean isPrime = isPrime(i);
			if(isPrime) {
				count++;
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		
		int userInput = 10000;
		int isPrimeCount = countIsPrime(userInput);
		System.out.println("1부터 "+userInput+"사이에 소수의 개수는 "+isPrimeCount+"개 입니다.");
		
	}
}
