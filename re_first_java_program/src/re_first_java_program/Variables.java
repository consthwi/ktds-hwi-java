package re_first_java_program;

/**
 * 변수는 데이터를 호출하기 위한 메모리주소 별칭
 * Java는 숫자형데이터를 관리하기 위해서 메모리 범위에 주의해야한다.
 * 10억 미만의 숫자를 관리하기 위해서는 int사용
 * but 숫자는 int가 default이므로,
 * 10억 이상의 숫자를 관리하기 위해선 long 및 할당하는 숫자 뒤 L(l)기입
 * ...double, float도 유사함
 */
public class Variables {
	
	public static void main(String[] args) {
		// byte
		byte smallNumber = 1;
		byte smallNumber2 = Byte.MAX_VALUE;
		System.out.println(smallNumber);
		System.out.println(smallNumber2);
		
		// short
		short smallNumber3 = Short.MAX_VALUE;
		System.out.println(smallNumber3);
		
		// int
		int intNumber = Integer.MAX_VALUE;
		System.out.println(intNumber);
		
		// double
		/*
		 * (int) 형변환;
		 * */
		double rndDouble = Math.floor(Math.random()*10);
		int rndInt = (int) Math.floor(rndDouble);
		System.out.println(rndInt);
		
	}
	
}
