package problem0123;

/**
 * 문제13)
 *  실수형 변수 두 개를 선언하고 임의의 값을 할당한다.
	두 값 중 큰 수만 출력한다.
 */
public class Problem13 {
	
	/**
	 * 두 숫자를 파라미터로 입력할 때, 큰 숫자가 반환되는 메서드
	 * @param num1 비교할 첫 번째 숫자
	 * @param num2 비교할 두 번째 숫자
	 * @return double 비교하여 큰 숫자
	 */
	public static double max(double num1, double num2) {
		if(num1 > num2) {
			return num1;
		}
		else if(num1 < num2) {
			return num2;
		}
		else {
			System.out.println("두 값이 같으므로 반환할 값이 없습니다.");
			return Double.NaN;
		}
	}
	
	public static void main(String[] args) {
		
		// 0~100사이 임의의 실수값(소수점 두자리까지 출력)
		double num1 = Math.random()*101;
		num1 = Math.round(num1*100) / 100.0;

		double num2 = Math.random()*101;
		num2 = Math.round(num2*100) / 100.0;
		
		double result = max(num1, num2);
		System.out.println("num1: "+num1+" num2: "+num2);
		System.out.println("두 수를 비교하여 반환된 큰 수는 "+result+"입니다.");

	}
	
}
