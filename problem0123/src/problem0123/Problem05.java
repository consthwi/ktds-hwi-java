package problem0123;

import java.util.Scanner;

/**
 * 문제5)
 * 파라미터값의 소수 여부를 판단하는 메서드
 */
public class Problem05 {

	/**
	 * 파라미터가 소수인지 판별하는 메서드
	 * @param num 사용자가 입력하는 숫자
	 * @return 소수이면 true, 그렇지 않으면 false
	 */
	public static boolean isPrime(int userInput) {
		// 1보다 작은 수는 소수가 아님
		if(userInput <= 0) {
			return false;
		}
		
		// 2부터 1씩 증가하여 파라미터값보다-1까지 루프하여 몫 여부 판단
		for(int i=2; i<userInput; i++) {
			if(userInput % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 콘솔에서 입력한 값이 소수인지 판별하여 출력하는 메인메서드
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String res;
		boolean isPrime;
		
		System.out.println("소수 판별 프로그램을 시작합니다.");
		System.out.println("소수인지 판별할 숫자를 입력하세요.");
		int userInput = scanner.nextInt();

		while(true) {
			 isPrime = isPrime(userInput);
			
			if(isPrime) {
				System.out.println("입력한 숫자는 소수입니다.");
			}
			else {
				System.out.println("입력한 숫자는 소수가 아닙니다.");
			}
			
			System.out.println("다시 숫자를 입력하시겠습니까? (y/n)");
			scanner.nextLine(); // 스캐너 버퍼 초기화
			res = scanner.nextLine();
			
			if(res.equalsIgnoreCase("n")) {
				System.out.println("소수 판별 프로그램을 종료합니다.");
				break;
			}
			else if(!res.equalsIgnoreCase("y")) {
				System.out.println("잘못된 입력입니다.");
				System.out.println("소수 판별 프로그램을 종료합니다.");
				break;
			}
			// y를 입력할 경우 userInput 변수값 업데이트
			else {
				System.out.println("소수인지 판별할 숫자를 다시 입력하세요.");
				userInput = scanner.nextInt();
			}
		}

		
		
	}
}
