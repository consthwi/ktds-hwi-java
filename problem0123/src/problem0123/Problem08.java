package problem0123;

/**
 * 문제8)
 *  정수형 변수 2개를 선언하고 값을 할당한다.
	값이 할당된 정수형 변수 2개의 곱을 구해 새로운 정수형 변수에 할당한다.
	곱이 할당된 변수의 값을 출력해본다.
 */
public class Problem08 {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		
		int result = num1*num2;
		System.out.println("num1: "+num1+", num2: "+num2);
		System.out.println("변수값의 곱은 "+result+"입니다.");
		
	}
	
}
