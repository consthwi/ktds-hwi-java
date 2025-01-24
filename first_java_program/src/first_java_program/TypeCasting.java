package first_java_program;

/**
 * 형변환 실습
 */
public class TypeCasting {
	public static void main(String[] args) {
		
		/**
		 * 묵시적 형변환
		 */
		// 1. int (4byte) 타입의 변수 정의 및 값 할당.
		int intNumber = Integer.MAX_VALUE;
		
		// 2. long (8byte) 타입의 변수 정의 및 값 할당. (int 타입의 값을 할당)
		long longNumber = intNumber;
		// 아무런 문제 없이 할당. (묵시적 형변환: 작은 바이트에 큰 바이트로 자연스로운 이)
		
		// 3. 각 변수들의 값을 출력.
		System.out.println(intNumber);
		System.out.println(longNumber);
		
		/**
		 * 명시적 형변환
		 */
		// 1. long (8byte) 타입의 변수 정의 및 값 할당.
		// long longNumber2 = Long.MAX_VALUE;
		long longNumber2 = 3_000_000_000L;
		// => L(l)을 기입하지 않으면 숫자는 무조건 int로 인식하는 것을 주의
		
		// 2. int (4byte) 타입의 변수 정의 및 값 할당.
		// int intNumber2 = longNumber2;
		// => 묵시적 형변환이 불가능하므로, 개발자가 직접 형변환을 해주어야 한다.
		// => *long 타입의 값을 int 타입으로 명시해서 변환이 필요 (명시적 형변환)
		int intNumber2 = (int) longNumber2;
		
		// 3. 각 변수들의 값을 출력.
		System.out.println(intNumber2);
		System.out.println(longNumber2);
	
		
	}
}
