package problem_0123;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		System.out.println("2부터 19까지의 숫자를 입력하면 해당 숫자의 구구단이 출력됩니다! (-1을 입력하면 종료됩니다)");
		
		while(true) {
			
			// -1을 입력하면 구구단 종료
			if(userInput == -1) {
				System.out.println("구구단 출력을 종료합니다.");
				break;
			}
			// 2~19사이의 숫자를 입력하면 구구단 출력
			else if(userInput >= 2 && userInput <= 19) {
				for(int i=1; i<=userInput; i++) {
					System.out.println(userInput+"단");
					System.out.println(userInput+" * "+i+" = "+userInput*i);
				}
				break;
			}
			// 2~19사이의 숫자가 아닌 다른 숫자를 입력하면 경고
			else {
				System.out.println("2~19사이의 숫자를 입력하세요.");
			}
			
			
			
		}
	
		
	}
	
}
