package problem0123;

/**
 * 문제14)
 *  실수형 변수 세 개를 선언하고 임의의 값을 할당한다.
	세 값 중 가장 작은 수만 출력한다.
 */
public class Problem14 {

	/**
	 * 세 숫자를 파라미터로 입력할 때, 가장 작은 숫자가 반환되는 메서드
	 * @param num1 비교할 첫 번째 숫자
	 * @param num2 비교할 두 번째 숫자
	 * @param num3 비교할 세 번째 숫자
	 * @return double 가장 작은 숫자
	 */
	public static double min(double num1, double num2, double num3) {

		// 현재 최소값을 파라미터1로 가정
		double currentMinValue = num1;
		
		// 현재 최소값보다 num2가 적을 경우, 최소값을 num2로 업데이트
		if(currentMinValue > num2) {
			currentMinValue = num2;
		}
		
		// 현재 최소값보다 num3가 적을 경우, 최소값을 num3로 업데이트
		if(currentMinValue > num3) {
			currentMinValue = num3;
		}
		
		return currentMinValue;
		
	}
	
	public static void main(String[] args) {
		
		// 0~100사이 임의의 실수값(소수점 두자리까지 출력)
		double num1 = Math.random()*101;
		num1 = Math.round(num1*100) / 100.0;

		double num2 = Math.random()*101;
		num2 = Math.round(num2*100) / 100.0;
		
		double num3 = Math.random()*101;
		num3 = Math.round(num3*100) / 100.0;
		
		double result = min(num1, num2, num3);
		System.out.println("num1: "+num1+" num2: "+num2+" num3: "+num3);
		System.out.println("세 수를 비교하여 반환된 가장 작은 수는 "+result+"입니다.");

	}
	
}
