package first_java_program;

public class ForStatement {
	
	// jbm이 main메소드 호출
	public static void main(String[] args) {
		
		// 1. 1부터 10까지 출력하기
//		for(int i=1; i<11; i++) {
//			System.out.println(i);
//		}
		
		// 2. 1부터 10사이에 있는 홀수만 출력하기
//		for(int i=1; i<11; i++) {
//			if(i%2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		// 3. 2부터 100_000 사이에 있는 짝수만 출력하기.
//		for(int i=2; i<100_001; i++) {
//			if(i%2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		// 무한 for반복문 (참고)
		// for(;;){}
		
		// ============================================
		// 구구단
		
//		for(int i=2; i<10; i++) {
//			System.out.println("====="+i+"단=====");
//			System.out.println(i+" * "+1+" = "+i*1);
//			System.out.println(i+" * "+2+" = "+i*2);
//			System.out.println(i+" * "+3+" = "+i*3);
//			System.out.println(i+" * "+4+" = "+i*4);
//			System.out.println(i+" * "+5+" = "+i*5);
//			System.out.println(i+" * "+6+" = "+i*6);
//			System.out.println(i+" * "+7+" = "+i*7);
//			System.out.println(i+" * "+8+" = "+i*8);
//			System.out.println(i+" * "+9+" = "+i*9);
//		}
		
//		for(int i=2; i<10; i++) {
//			System.out.println("====="+i+"단=====");
//			for(int j=1; j<10; j++) {
//				System.out.println(i+" * "+j+" = "+i*j);
//			}
//		}
		
		// ==========================
		// 연습문제 1
		int result1 = 0;
		for(int i=1; i<101; i++) {
			result1 += i;
		}
		System.out.println("1부터 100까지의 합은 "+result1+"입니다.");
		
		// 연습문제 2
		int result2 = 0;
		for(int i=1; i<101; i++) {
			if(i%2==1) {
				result2 += i;
			}
		}
		System.out.println("1부터 100까지 숫자 중 홀수의 합은 "+result2+"입니다.");
		
		// 연습문제 3
		int result3 = 0;
		for(int i=1; i<101; i++) {
			if(i%3==0 && i%5==0 && i%6==0) {
				result3 += i;
			}
		}
		System.out.println("1부터 100까지 숫자 중 3,5,6배수의 합은 "+result3+"입니다.");
		
		// 연습문제 4
		for(int i=1; i<=5; i++) {
			// j가 가질 수 있는 최대값(조건)은 i
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 연습문제 4-2
		for(int i=0; i<=4; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 추가문제 (while)
		// num변수에 기입한 숫자의 각 자릿수(10나눈 몫)를 더한 값 출력
		// 몇 자리일까?
		int num = 23589;
		int result5 = 0;
		int count = 0;
		while(num > 0) {
			if(num > 0) {
				count++;
			}
			result5 += num%10;
			num /= 10;

		}
		System.out.println("각 자릿수의 합은 "+result5+"입니다.");
		System.out.println("총 "+count+"자리 숫자입니다.");
		
		// 추가문제 (for)
		int result6 = 0;
		int count2 = 0;
		for(int num2=523592; num2>0; num2/=10) {
			if(num2>0) {
				count2++;
			}
			result6 += num2%10;
		}
		System.out.println("각 자릿수의 합은 "+result6+"입니다.");
		System.out.println("총 "+count2+"자리 숫자입니다.");
		
		// ========
		// 풀이
		int num3 = 7237;
		// num이 몇 번째 자리까지 있나? ==> 10을 몇 번 제곱해야 num이 되나?
		int length = (int) Math.log10(num3) + 1;
		int result7 = 0;
		// num의 자릿수만큼 반복하여 더한다.
		for(int i=0; i<length; i++) {
			int n = num3%10;
			result7 += n;
			num3 /= 10;
		}
		System.out.println("각 자릿수의 합은 "+result7+"입니다.");
		System.out.println("총 "+length+"자리 숫자입니다.");
		
		// 풀이2
		int num4 = 7237;
		// 숫자를 문자열로 바꾼다.
		// 문자열 한글자 한글자를 더하기 위해서
		String numStr = num4 + "";
		int result8 = 0;
		for(char n: numStr.toCharArray()) {
			result8 += Integer.parseInt(n+"");
		}
		System.out.println("모든 자리를 더하면 "+result8+"입니다.");
	}
	
}
