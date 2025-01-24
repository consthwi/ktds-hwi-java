package first_java_program;

import java.util.Scanner;
//ctrl + shift + o ... error제거

public class WhileUpdownGame {

	public static void main(String[] args) {
		
		// 1. 난수(정수) 생성
		System.out.println("1부터 100까지의 숫자를 입력하세요! (5번의 기회 제공)");
		int quiz = (int)(Math.random() * 100+1);
		int failCount = 0;
		
		// 2. 사용자에게 값을 입력받는다.
		Scanner keyboard = new Scanner(System.in);
		// => 입력받기 위한 준비단계
		
		while(true) {
			int answer = keyboard.nextInt();
			
			// *3. 난수와 사용자가 입력한 값이 같은가?
			// 3의 결과가 실패횟수를 증감시키는 것으로 변경되므로
			// 크다 작다의 판단기준이었던 if else문이 변경된다.
			if(quiz == answer) {
				System.out.println("정답입니다.");
				break;
			}
			// break로 인해 else 불필요
			// 난수와 사용자가 입력한 값이 틀렸을 때,
			// 실패횟수를 1 증가시킨다.
			failCount++;
			// 실패횟수가 3보다 크거나 같다면, 게임을 종료시킨다.
			if(failCount >= 5) {
				System.out.println("5회 이상 틀려서 게임을 종료합니다.");
				System.out.println("정답은 "+quiz+"입니다.");
				break;
			}
			
			// 4. 난수가 사용자가 입력한 값보다 큰지 비교
			else if(quiz > answer) {
				System.out.println("더 큰 수를 입력하세요");
			}
			// 5. 난수가 사용자가 입력한 값보다 작은지 비교
			else {
				System.out.println("더 작은 수를 입력하세요");
			}
		}
		
	}
	
}
