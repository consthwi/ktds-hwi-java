package first_java_program;

/**
 * 상수를 정의하는 방법과 네이밍 규칙에 대한 설명
 */
public class Constants {
	public static void main(String[] args) {
		// 상수 네이밍 규칙은 모두 대문자+snake_case
		final int SPEED_OF_LIGHT = 299_792_458;
		System.out.println(SPEED_OF_LIGHT);
		// 상수에 값이 이미 할당 되어 있는 경우 값의 재할당이 불가능하다.
		// SPEED_OF_LIGHT = 10;
		
		final int LIMIT_AGE; // 값이 비어있는 상수 정의(선언)
		// 값이 비어있는 상수인 경우는 최초 할당만 가능하다.
		LIMIT_AGE = 20;
		// LIMIT_AGE = 30;
		System.out.println(LIMIT_AGE);
		
		System.out.println(Math.PI);
	}
}
