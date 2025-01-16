package first_java_program;

public class VariableScope {
	public static void main(String[] args) {
		
		// ctrl+Y: 앞으로 돌리기
		/*
		 *  *debugging perspective:
		 *  1. 해당하는 라인에 더블클릭으로 breakpoint설정
		 *  2. F6으로 breakpoint이후 parsing
		 *  3. variable창에서 데이터 확인
		 */
		
		int age = 41;
		{
			System.out.println(age);
			int limit = 30;
			System.out.println(limit);
		}
		// limit변수 메모리 초기화시점<
		
 		System.out.println("실행이 종료되었습니다");
		
		// 사용한 변수는 {} parsing이 끝나고나면 메모리에서 지워진다.
	}
	// age변수 메모리 초기화시점<
}
