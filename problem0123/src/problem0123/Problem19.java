package problem0123;

import java.util.Scanner;

/**
 * 문제19)
 *  Scanner 이용.
	2의 배수만 입력하는 문제를 만든다.
	만약, 2의 배수가 아니거나 0 또는 음수를 입력하면
	"게임을 마칩니다" 를 출력하며 반복문을 종료한다.
 */
public class Problem19 {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2의 배수를 입력하세요.");
		System.out.println("만약, 2의 배수가 아니거나 0 또는 음수를 입력하면 게임이 종료됩니다.");
		int userInput = scanner.nextInt();
		
		while(true) {
			// 2의 배수가 아니거나 0 또는 음수를 입력하면 게임 종료
			if(userInput%2==1 || userInput==0 || userInput<0) {
				System.out.println("게임을 마칩니다.");
				break;
			}
			
			if(userInput%2==0) {
				System.out.println("입력한 숫자는 2의 배수가 맞습니다!");
				System.out.println("다시 한번 2의 배수를 입력하세요.");
				userInput = scanner.nextInt();
			}
			
		}
		
	}
	
}
