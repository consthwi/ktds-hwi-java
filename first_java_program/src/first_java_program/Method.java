package first_java_program;

public class Method {
	
	public static int getTestNumber() {
		int num1 = (int)(Math.random()*100);
		
		if(num1>90) {
			return 100;
		}
		else if(num1>50) {
			return 30;
		}
		else {
			return 50;
		}
	}
	
	/**
	 * 숫자 두 개를 랜덤하게 생성을 하고 두 숫자를 더한 결과를 반환시키는데
	 * 숫자 중 하나라도 5보다 작은 숫자가 있다면 -1을 반환시킨다.
	 */
	public static int getConditionalAdditionResult() {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		if(num1<5) {
			return -1;
		}
		if(num2<5) {
			return -1;
		}
		return num1+num2;
	}
	
	/**
	 * 1과 10 사이에 홀수만 출력한다.
	 */
	public static void printNumbers() {
		for(int i=1; i<11; i++) {
			if(i%2==1) {
				System.out.println(i);
				return;
				// 반환 타입이 void인 메소드에서의 return은 메소드를 즉시 종료시켜버린다.
				// callStack pop
			}
		}
	}
	
	/**
	 * 파라미터는 없다.
	 * 임의의 숫자 두개를 만들어서 값을 할당하고, 두 숫자의 합을 반환시킨다.
	 */
	
	public static int getAdditionResult() {
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		return num1+num2;
	}
	
	
	
	/**
	 * 정수 파라미터 두개를 받아서, 
	 * 첫 번째 파라미터 정수에 두 번째 파라미터 정수만큼 곱해서
	 * 문자열 파라미터와 함께 출력.
	 * @param number 정수
	 * @param time 제곱할 횟수
	 * @param message 결과와 함께 출력해주고 싶은 문자열
	 */
	public static void printPowerNumberWithMessage( int number, int time, String message ) {
		
		long result = 1;
		for(int i=1; i<time; i++) {
			result *= number;
		}
		
		System.out.println(message+result);
		
	}
	
	// int inputNum: 파라미터, Argument, 인자 => 임시변수
	public static void printPowerNumber(int inputNum) {
		// 메소드 내의 변수는 지역변수
		int result = (int) Math.pow(inputNum, 2);
		System.out.println(inputNum+"의 제곱수는 "+result+"입니다.");
	}
	
	/**
	 * 정해진 숫자 두 개를 더해 출력하는 메소드
	 * 숫자를 더하는 방법과 출력하는 방법이 기술.
	 */
	public static void add() {
		int number1 = 2;
		int number2 = 5;
		int addResult = number1 + number2;
		System.out.println(number1+" + "+number2+" = "+addResult);
	}
	
	/**
	 * 숫자(정수)를 담는 변수 두개에 임의의 값을 할당하고
	 * 두 숫자 중에서 더 큰 숫자를 출력한다.
	 */
//	public static void printMaxValue(int num1, int num2) {
//		int result = (int) Math.max(num1, num2);
//		System.out.println("입력한 두 숫자 중 최대값은 "+result+"입니다.");
//	}
	
	public static void printBiggiestNumber() {
		int number1 = (int) (Math.random()*10000);
		int number2 = (int) (Math.random()*10000);
		if(number1 > number2) {
			System.out.println(number1+"이 "+number2+"보다 큽니다.");
		}
		else if(number2 > number1) {
			System.out.println(number2+"이 "+number1+"보다 큽니다.");
		} else {
			System.out.println(number1+"과 "+number2+"는 같습니다.");
		}
	}
	
	/**
	 * 숫자(정수)를 담는 변수 두개에 임의의 값을 할당하고
	 * 두 숫자를 뻈을 때 음수가 나오는 경우만 출력한다.
	 */
//	public static void printMinusValue(int num1, int num2) {
//		if(num1 < num2) {
//			int rest = Math.abs(num2-num1);
//			System.out.println("결과는 음수이며 두 숫자의 차이는 "+rest+"입니다.");
//		}
//		else {
//			System.out.println("결과가 음수가 아닙니다.");
//		}
//	}
	public static void printNegativeNumber() {
		int number1 = (int) (Math.random()*10000);
		int number2 = (int) (Math.random()*10000);
		
		if(number1 > number2) {
			System.out.println(number2 - number1);
		} else if(number2 > number1) {
			System.out.println(number1 - number2);
		}
	}
	
	/**
	 * 1부터 1000까지의 숫자 중에 
	 * 소수(Prime Number: 자신과 1로만 나누어지는 수)를 찾아서 출력한다.
	 */
	public static void printPrimeNumber() {
		for(int i=2; i<1001; i++) {
			
			// 1. 모든 수를 소수로 가정한다. (초기화)
			boolean isPrimeNumber = true;
			
			for(int j=1; j<=i; j++) {
				// 1과 자신의 수로는 나누지 않는다.
				if(j!=1 && j!=i) {
					if(i%j == 0) {
						isPrimeNumber = false;
						break; // 소수가 아님
					}
					// j for가 끝까지 반복을 했을 때, 0으로 나누어진 수가 존재했는가?
				}
				
			}
			
			if(isPrimeNumber) {
				System.out.println(i);
			}
		}
	}
	

	
	/**
	 * Method 클래스를 실행시키기 위한 특별한 메소드
	 * 이 메소드는 JVM이 실행한다.
	 * 일반적으로 main메소드는 최하단에 기술
	 * @param args main메소드를 실행할 떄 필요한 인자(파라미터)
	 */
	
	public static void main(String[] args) {
		System.out.println("add메소드를 호출하는 코드입니다.");
		printBiggiestNumber();
		// method탐색 F5
		printNegativeNumber();
//		printMaxValue(10, 200);
//		printMaxValue(100, 60);
//		printMinusValue(50, 60);
//		printMinusValue(50, 20);
//		printMinusValue(50, 150);
		printPrimeNumber();
		printPowerNumber(216);

		// ( int number, int time, String message )
		printPowerNumberWithMessage(10, 10, "1. 결과는?: ");
		
		int addResult = getAdditionResult();
		System.out.println(addResult);
		
		int number = getConditionalAdditionResult();
		System.out.println(number);
		
		System.out.println(getTestNumber());
		
	}
	
}
