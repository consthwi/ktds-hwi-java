package first_java_program;

public class WhileStatement {
	
	public static void main(String[] args) {
		
		// 1. 1부터 10까지 출력하자.
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		...
//		System.out.println(10);
		
		// 2. 1부터 10까지 출력하자. (++이용)
//		int i = 0;
//		while(i<10) {
//			System.out.println(++i);
//		}
		
		// 3. 1부터 10까지 출력하자. (while 이용)
//		int i = 0;
//		while(i<10) {
//			i+=1;
//			System.out.println(i);
//		}
		
		// 3. 1부터 10까지 출력하자. (무한반복 이용)
		System.out.println("출력이 시작됩니다.");
		int i = 0;
		while(true) {
			i+=1;
			System.out.println(i);
			// 반드시 while true구문 탈출 조건 명시
			if(i == 10) {
				break; // 흐름을 끊는다.
			}
		}
		System.out.println("출력이 끝났습니다.");
		
	}
	
}
