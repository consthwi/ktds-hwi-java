package problem0123;

/**
 * 문제7)
 *  정수형 변수 4개를 선언하고 값을 할당한다.
	값이 할당된 정수형 변수 4개의 합을 구해 새로운 정수형 변수에 할당한다.
	합이 할당된 변수의 값을 출력해본다.
 */
public class Problem07 {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		int num3 = (int)(Math.random()*100);
		int num4 = (int)(Math.random()*100);
		
		int result = num1+num2+num3+num4;
		System.out.println("num1: "+num1+", num2: "+num2+", num3: "+num3+", num4: "+num4);
		System.out.println("변수값의 총합은 "+result+"입니다.");
		
	}
	
}
