package first_java_program;

public class Operator {
	public static void main(String[] args) {
		// 숫자를 문자로 변경하기
		// 1. 
		int age = 30;
		String ageString = String.valueOf(age); // Number => String변환
		System.out.println(age+1);
		System.out.println(ageString+1);
		
		// **2.
		int count = 16;
		String countString = count + ""; // Number => String변환 성공
		System.out.println(count+1);
		System.out.println(countString+1);
		
		/*
		 * 정수 / 정수 = 정수
		 * 정수 / 실수 = 실수
		 * 실수 / 실수 = 실수
		 * Number(1byte) Operator String(Infinity) => String(Infinity)
		 * */
		
		int testNum = 10;
		int resultNum1 = testNum / 3;
		// 정수 / 정수 => 정수
		float resultNum2 = testNum / 3.0f;
		// 정수 / 실수 => 실수
		System.out.println(resultNum1);
		System.out.println(resultNum2);
		
	}
}
