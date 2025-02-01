package problem0123;

/**
 * 문제12)
 *  정수형 변수 2개를 선언하고 값을 할당한다.
	값이 할당된 정수형 변수 2개의 나누기 결과를 구해 새로운 실수형 변수에 할당한다.
	나누기 결과가 할당된 변수의 값을 출력해본다.
	단, 소수점 이하의 자리수는 2자리만 저장해 출력한다.
	예> 10.3333333 => 10.34
 */
public class Problem12 {

	public static void main(String[] args) {
		
		int num1 = 35;
		int num2 = 6;
		
		double result1 = (double)num1 / num2;
		double result2 = Math.round(result1*100) / 100.0; // (double)100
		
		System.out.println("나눗셈 결과: "+result1);
		System.out.println("나눗셈 결과(소수점 두자리 유지): "+result2);
		
	}
	
}
