package first_java_program;

public class ArithmaticOperator {
	
	public static void main(String[] args) {
		
		/**
		 * 중요)
		 * 좌항이나 우항 중 하나라도 연산범위가 클 경우
		 * 연산의 결과가 연산범위 큰 쪽의 type을 따른다
		 */
		
		int number1 = 1_500_000_000;
		int number2 = 1_500_000_000;
		long number3 = number1 + (long) number2;
		//				=> 좌항 + (long)우항 ... long으로 명시적 형변환
		System.out.println(number3);
		
		int number4 = 10;
		int number5 = 3;
		// int number6 = number4 / number5; // => 3
		double number6 = (double) number4 / number5; // => 3.333
		//					=> (double)좌항 + 우항 ... double로 명시적 형변환
		double number7 = (number4*1.0) / number5; // => 3.333
		//					=> nubmer4 * double ... double로 묵시적 형변환
		System.out.println(number6);
		System.out.println(number7);
		
		int number8 = 9;
		int remain = number8 % 2;
		System.out.println(remain);
		
		// 셀프 연산
		// - 스스로에게 연산하기
		int count = 0;
		// count 변수의 값을 1증가시키려면?
		count = count + 1; // 1
		count = count + 1; // 2
		count = count + 1; // 3
		
		int count2 = 0;
		count2 += 1; // 1
		count2 += 1; // 2
		count2 += 1; // 3
		
		int count3 = 0;
		count3++; // 1
		count3++; // 2
		count3++; // 3
		System.out.println(count3);
		
		int count4 = 0;
//		count4++; // 1
		System.out.println(count4++);
//		count4--; // 0
		System.out.println(count4--);
		
//		--count4; // -1
		System.out.println(--count4);
//		++count4; // 0
		System.out.println(++count4);
		
		
	}
	
}
