package first_java_program;

public class typePractice {
	public static void main(String[] args) {
		// ==============================================
		// 실습: 정수 -> 부동소수점 (83슬라이드)
		int testNumber = 10;
		float fTestNumber = testNumber;
		double dTestNumber = testNumber;
		System.out.println(testNumber);
		System.out.println(fTestNumber);
		System.out.println(dTestNumber);
		// 정수 < 부동소수점 (묵시적 형변형)
		
		// 실습: 부동소수점 -> 정수 (84슬라이드)
		float fTestNumber2 = 3.14f;
		int testNumber2_1 = (int) fTestNumber2;
		System.out.println(testNumber2_1);
		
		double dTestNumber2 = 3.14;
		int testNumber2_2 = (int) dTestNumber2;
		System.out.println(testNumber2_2);
		// 부동소수점 > 정수 (명시적 형변형 필요)
		
		// 실습: 부동소수점 소수점 처리 (85슬라이드)
		double dNum = 3.14;
		
		double dNumFloor = Math.floor(dNum);
		int dNumFloorToInt = (int) dNumFloor;
		System.out.println("dNumFloor: "+dNumFloor);
		System.out.println("dNumFloorToInt: "+dNumFloorToInt);
		
		// 실습: 부동소수점 소수점 올림처리 (86슬라이드)
		double dNumCeil = Math.ceil(dNum);
		int dNumCeilToInt = (int) dNumCeil;
		// double -> int (명시적 형변형 필요)
		System.out.println("dNumCeil: "+dNumCeil);
		System.out.println("dNumCeilToInt: "+dNumCeilToInt);
		
		// 실습: 문자열 -> 정수 변환 (88슬라이드)
		String numberString = "10";
		int numberStirngToInt = Integer.parseInt(numberString);
		System.out.println("정수: "+numberStirngToInt);
		
		// 실습: 문자열 -> 정수 오류 실습 (89슬라이드)
//		String testString = "A";
//		String testString2 = "10 "; // 공백 포함, 오로지 숫자만 parsing
//		int testStringToInt = Integer.parseInt(testString);
//		System.out.println("정수"+testStringToInt);
		// => NumberFormatException오류 발생 
		
		// 실습: 문자열 -> 부동소수점 변환 (90슬라이드)
		String numberString2 = "3.14";
		double numberString2ToDouble = Double.parseDouble(numberString2);
		System.out.println("부동소수점: "+numberString2ToDouble);
		
		String numberString3 = "10.66666666666";
		float fNumberString3 = Float.parseFloat(numberString3);
		System.out.println("fNumberString3: "+fNumberString3);
		
		String numberString4 = "11.12331561536123515231233"; // 소수점 이하 16자리까지 지원.
		double dNumberString4 = Double.parseDouble(numberString4);
		System.out.println("dNumberString4: "+dNumberString4);
		
		numberString4 = "12";
		double dNumberString5 = Double.parseDouble(numberString4);
		System.out.println("dNumberString5: "+dNumberString5);
		
		// 실습: 문자열 -> 불린 변환 (91-92슬라이드)
		String user1 = "true";
		boolean user1isSelected = Boolean.parseBoolean(user1);
		System.out.println("trueString: "+user1isSelected);
		
		String user2 = "";
		boolean user2isSelected = Boolean.parseBoolean(user2);
		System.out.println("space: "+user2isSelected);
		
		String user3 = "아무거나";
		boolean user3isSelected = Boolean.parseBoolean(user3);
		System.out.println("anyString: "+user3isSelected);
		// => js(Truthy, Falsy) Boolean(String)
		// => 자바는 오직 "true" 문자열만 true로 변환
		//    Boolean.parseBoolean(String)
		
		System.out.println("===========================");
		
		long num = Long.MAX_VALUE;
		float fnum = num;
		System.out.println("Float Number => Decimal");
		System.out.println(fnum);
		// int,long => 부동소수점 변환은 지수처리로 인해 묵시적형변환 가능
		
		float fnum2 = 10.9f;
		int num2 = (int) fnum2;
		System.out.println(num2);
		
		System.out.println("==소수점 처리==");
		double dnum3 = 15.18;
		int dnum3ToInt = (int) dnum3;
		double dnum3Round = Math.round(dnum3ToInt);
		System.out.println(dnum3ToInt);
		System.out.println("dnum3Round: "+dnum3Round); //15.0
		// 15.2로 반올림하기 위해서는 번거로움 (*10, /10...)
		
	}
}
