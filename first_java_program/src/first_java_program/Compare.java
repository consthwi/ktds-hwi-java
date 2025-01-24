package first_java_program;

public class Compare {
	
	public static void main(String[] args) {
		
		int num = 9;
		boolean isGratherthan10 = num > 10;
		System.out.println(num+"은 10보다 큰가요?: "+isGratherthan10);
		
		int a = 10;
		boolean is11To19 = a > 10 && a < 20;
		System.out.println(a+"는 11을 초과하고 20미만인 수인가요?: "+is11To19);
		
		int b = 34525;
		boolean isEven = (b % 2) != 1;
		System.out.println(b+"는 짝수인가요?: "+isEven);
		
		double rndNum = Math.random()*10;
		int resultNum = (int) rndNum;
		
		boolean isGreatherThan5 = resultNum > 5;
		if(isGreatherThan5) {
			System.out.println(resultNum+": 축하합니다");
		} else {
			System.out.println(resultNum+": 아쉽지만 다음기회에..");
		}
		
		// c의 값이 0보다 큰 짝수인가?
		int c = (int) (Math.random()*6); // 0~5;
		// (int)사용할 떄 Casting 주의!
		
		boolean isEvenGreatherThan0 = (c % 2 == 0) && c > 0;
		System.out.println(c+"는 0보다 크고 짝수인가요?: "+isEvenGreatherThan0);
		
		// 변수 d의 값은 2 또는 5의 배수인가?
		int d = 35;
		boolean isMultiple2or5 = (d % 2 == 0) && (d % 5 == 0);
		// 5의 배수인 경우가 더 적으므로 false의 가능성이 높다..
		// => &&의 전항으로 사용, false가 먼저와야 뒷연산 패스 가능.
		System.out.println(d+"는 2와 5의 배수인가요?: "+isMultiple2or5);
		
		// son은 부모님과 함께 12세 이상 관람가의 영화를 볼 수 있나?
		int sonAge = 7;
		int parentAge = 40;
		boolean isAvailable = parentAge >= 12 || sonAge > 12;
		System.out.println("자식의 나이는 "+sonAge+"이며 부모의 나이는 "+parentAge+"이므로 "+isAvailable);
		
		// 변수 rndNum2는 2 또는 3의 배수이며 50보다 큰가?
		int rndNum2 = (int)(Math.random()*100);
		boolean isMultiple2Or3AndGratherThan50 =
				rndNum2 > 50 && (rndNum2 % 2 == 0 || rndNum2 % 3 == 0);
		// && || 가 혼용될 시, 무조건 &&가 먼저 연산되므로 주의할 것
		System.out.println(rndNum2+"는 2 또는 3의 배수이며 50보다 큰가?: "+isMultiple2Or3AndGratherThan50);
		
//		int f = (int) (Math.random()*1000);
		int f = (int) 738;
		// 1. 변수 f가 3의 배수가 아닌가? != 사용
		boolean isNotMultiple3 = f % 3 != 0;
		System.out.println(f+"는 3의 배수가 아닌가?: "+isNotMultiple3);
		
		// 2. 변수 f가 5의 배수가 아닌가? not 사용
		boolean isNotMultiple5 = !(f % 5 == 0);
		System.out.println(f+"는 5의 배수가 아닌가?: "+isNotMultiple5);
		
		// 3. 변수 f가 7 또는 9의 배수가 아닌가? != 사용
		boolean isNotMultiple7Or9 = (f % 7 != 0) || (f % 9 != 0);
		System.out.println(f+"는 7 또는 9의 배수가 아닌가?: "+isNotMultiple7Or9);
		
		// 4. 변수 f가 7 또는 9의 배수가 아닌가? not 사용
		boolean isNotMultiple7Or9_ver2 = !(f % 7 == 0) || !(f % 9 == 0);
//		boolean isNotMultiple7Or9_ver2 = !((f % 7 == 0) && (f % 9 == 0));
//		boolean isNotMultiple7Or9_ver2 = !((f % 7 == 0) || (f % 9 == 0));
		System.out.println(f+"는 7 또는 9의 배수가 아닌가?: "+isNotMultiple7Or9_ver2);
		
		
	}
	
}
