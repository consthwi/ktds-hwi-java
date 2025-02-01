package problem0123;

/**
 * 문제17)
 *  정수형 변수 다섯 개를 선언하고 임의의 값을 할당한다.
	다섯 값 중 2 또는 5 또는 6의 배수인 것들만 출력한다.
 */
public class Problem17 {
	
	public static boolean isTwoOrFiveOrSixMultiple (int num) {
		// 2 또는 5 또는 6의 배수일 경우 true 반환
		if(num%2==0 || num%5==0 || num%6==0) {
			return true;
		}
		// 아닐 경우 false 반환
		return false;
	}

	public static void main(String[] args) {
		
		// 1~100사이 임의의 정수값
		int num1 = (int)(Math.random()*100+1);
		int num2 = (int)(Math.random()*100+1);
		int num3 = (int)(Math.random()*100+1);
		int num4 = (int)(Math.random()*100+1);
		int num5 = (int)(Math.random()*100+1);
		
		System.out.println("num1: "+num1+" num2: "+num2+" num3: "+num3+" num4: "+num4+" num5: "+num5);
		System.out.println("===========================================");
		System.out.println("2 또는 5 또는 6의 배수인 값을 출력합니다.");
		if(isTwoOrFiveOrSixMultiple(num1)) {
			System.out.println("num1값("+num1+")은 위 조건에 해당합니다.");
		}
		if(isTwoOrFiveOrSixMultiple(num2)) {
			System.out.println("num2값("+num2+")은 위 조건에 해당합니다.");
		}
		if(isTwoOrFiveOrSixMultiple(num3)) {
			System.out.println("num3값("+num3+")은 위 조건에 해당합니다.");
		}
		if(isTwoOrFiveOrSixMultiple(num4)) {
			System.out.println("num4값("+num4+")은 위 조건에 해당합니다.");
		}
		if(isTwoOrFiveOrSixMultiple(num5)) {
			System.out.println("num5값("+num5+")은 위 조건에 해당합니다.");
		}
		if(!isTwoOrFiveOrSixMultiple(num1) 
				&& !isTwoOrFiveOrSixMultiple(num2) 
				&& !isTwoOrFiveOrSixMultiple(num3) 
				&& !isTwoOrFiveOrSixMultiple(num4) 
				&& !isTwoOrFiveOrSixMultiple(num5)) 
		{
			System.out.println("모든 값이 위 조건에 해당하지 않습니다.");
		}
		
	}
	
}
