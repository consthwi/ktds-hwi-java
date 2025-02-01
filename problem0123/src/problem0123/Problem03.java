package problem0123;

import java.util.Scanner;

/**
 * 문제3)
 * 계산기 만들기
 */
public class Problem03 {
	
	/**
	 * 메인 메서드에서 호출할 계산 메서드 생성
	 * @param operator 사용자가 입력하는 연산자
	 * @param num1 사용자가 입력하는 첫 번째 숫자
	 * @param num2 사용자가 입력하는 두 번째 숫자
	 * @return double
	 */
	public static double calculate(String operator, double num1, double num2) {
		if(operator.equals("+")) {
			return num1 + num2;
		}
		else if(operator.equals("-")) {
			return num1 - num2;
		}
		else if(operator.equals("*")) {
			return num1 * num2;
		}
		else if(operator.equals("/")) {
			return num1 / num2;
		}
		else {
			return Double.NaN; // 잘못된 연산자 입력할 경우 NaN 반환
		}
	}
	
	// 메인 메서드
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String operator;
		double num1;
		double num2;
		
		System.out.println("계산기 프로그램을 시작합니다.");
		
		while(true) {
			System.out.println("연산자(+, -, *, /)를 입력하세요.");
			System.out.println("exit를 입력하면 프로그램을 종료합니다.");
			operator = scanner.nextLine();
			
			// exit를 입력할 경우 프로그램 종료 (대소문자 무시)
			if(operator.equalsIgnoreCase("exit")) {
				System.out.println("계산기 프로그램을 종료합니다.");
				break;
			}
			
			// +, -, *, /를 입력하지 않은 경우 아래 구문 skip
			if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
				System.out.println("잘못된 연산자를 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			System.out.println("첫 번째 숫자를 입력하세요: ");
			num1 = scanner.nextDouble();
			System.out.println("두 번째 숫자를 입력하세요: ");
			num2 = scanner.nextDouble();
			
			double result = calculate(operator, num1, num2);
			System.out.println("결과: "+result);
			
			// 추가 기능: 연산 종료 후 추가 연산 여부 확인
			System.out.println("다른 숫자로 연산하시겠습니까? (y/n)");
			scanner.nextLine(); // * nextDouble과 nextLine을 혼용할 경우 생기는 버퍼문제 방지 ... 버퍼 초기화
			String res = scanner.nextLine();
			// n을 입력한 경우 프로그램 종료 (대소문자 무시)
			if(res.equalsIgnoreCase("n")) {
				System.out.println("계산기 프로그램을 종료합니다.");
				break;
			}
			// y가 아닌 문자를 입력한 경우 (대소문자 무시)
			else if(!res.equalsIgnoreCase("y")) {
				System.out.println("잘못된 입력입니다.");
				System.out.println("계산기 프로그램을 종료합니다.");
				break;
			}
			// y를 입력한 경우
			else {
				System.out.println("계산기 프로그램을 재시작합니다.");
			}
		}
		

		
	}
	
}
