package first_java_program;

// class명: CapitalCase
// 변수명: camelCase
// in Java.. 변수를 선언할 때 자료형타입을 함께 지정하고 데이터 할당
public class Variables {
	
	public static void main(String[] args) {
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE+1);
		
		// byte, short type은 사용 적음
		byte byteNumberVariable = Byte.MAX_VALUE;
//		byteNumberVariable = byteNumberVariable + 1;
		System.out.println(byteNumberVariable);
		
		// 10억 미만의 숫자를 관리할 경우
		int intNumberVariable;
		intNumberVariable = 50;
		System.out.println(intNumberVariable);

		byte firstNumber = 100;
		byte secondNumber = 110;
		byte thirdNumber = (byte)(firstNumber + secondNumber);
		System.out.println(thirdNumber);
		
		// long type을 인식하게 하기 위해선 할당하는 숫자 마지막에 L(l)을 기입
		// 기입하지 않으면 Int로 인식한다
		long hugeNumber = 3_000_000_000L;
		System.out.println(hugeNumber);
		
		// 소수점 기본 double
		double doubleNumberVariable = 3.14;
		System.out.println(doubleNumberVariable);
		
		// 소수점을 float으로 변환하기 위해서는 할당하는 숫자 마지막에 F(f) 기입
		// 기입하지 않으면 double로 인식한다
		float floatNumberVariable = 3.14F;
		System.out.println(floatNumberVariable);
		
		boolean yesOrNo = true;
		boolean yesOrNo2 = false;
		System.out.println(yesOrNo);
		System.out.println(yesOrNo2);
		boolean isGreaterThan = 3 > 1;
		System.out.println(isGreaterThan);
		
		char letter = 'a';
		System.out.println(letter);
		System.out.println(letter+1);
		System.out.println( (char)(letter+1) );
		
	}
	
}
