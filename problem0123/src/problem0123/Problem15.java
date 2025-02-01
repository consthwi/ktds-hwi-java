package problem0123;

/**
 * 문제15)
 *  실수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
	다섯 값의 평균보다 큰 수들을 출력한다.
 */
public class Problem15 {

	// 평균보다 큰 여러 변수값이 존재할 수 있다... 
	// 메서드를 만들어 반환하기 위해서는 배열 개념 필요
	public static void main(String[] args) {
		
		// 0~100사이 임의의 실수값(소수점 두자리까지 출력)
		double num1 = Math.random()*101;
		num1 = Math.round(num1*100) / 100.0;

		double num2 = Math.random()*101;
		num2 = Math.round(num2*100) / 100.0;
		
		double num3 = Math.random()*101;
		num3 = Math.round(num3*100) / 100.0;
		
		double num4 = Math.random()*101;
		num4 = Math.round(num4*100) / 100.0;
		
		double num5 = Math.random()*101;
		num5 = Math.round(num5*100) / 100.0;
		
		double average = (num1+num2+num3+num4+num5)/5;
		System.out.println("평균값은 "+average+"입니다.");
		
		if(average < num1) {
			System.out.println("num1값("+num1+")은 평균보다 큽니다.");
		}
		if(average < num2) {
			System.out.println("num2값("+num2+")은 평균보다 큽니다.");
		}
		if(average < num3) {
			System.out.println("num1값("+num3+")은 평균보다 큽니다.");
		}
		if(average < num4) {
			System.out.println("num4값("+num4+")은 평균보다 큽니다.");	
		}
		if(average < num5) {
			System.out.println("num5값("+num5+")은 평균보다 큽니다.");
		}
		
	}
	
}
