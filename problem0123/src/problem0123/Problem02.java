package problem0123;

import java.util.Scanner;

/**
 * 문제2)
 * 무한 구구단
 */
public class Problem02 {

	public static void main(String[] args) {
		
		System.out.println("구구단 출력 프로그램을 시작합니다.");
		System.out.println("2~19까지의 숫자를 입력하세요! (-1을 입력하면 종료됩니다)");
		Scanner scanner = new Scanner(System.in);

		while(true) {
			
			int userInput = scanner.nextInt();
			
			// -1을 입력하면 구구단 종료
			if(userInput == -1) {
				System.out.println("구구단 출력 프로그램을 종료합니다.");
				break;
			}
			
			// 2~19사이의 숫자를 입력하면 구구단 출력
			else if(userInput >= 2 && userInput <= 19) {
				System.out.println("===== "+userInput+"단 =====");
				for(int i=1; i<=19; i++) {
					System.out.println(userInput+" * "+i+" = "+userInput*i);
				}
				System.out.println("=============");
				System.out.println("구구단 출력을 완료했습니다.");
				
				// 추가 기능: 다른 숫자의 구구단을 추가로 출력할지 사용자에게 질문
				System.out.println("다른 숫자의 구구단을 출력하시겠습니까? (y/n)");
				scanner.nextLine(); // * nextInt와 nextLine을 혼용할 경우 생기는 버퍼문제 방지 ... 버퍼 초기화
				String res = scanner.nextLine();
				
				// n을 입력할 경우 프로그램 종료 (대소문자 무시)
				if(res.equalsIgnoreCase("n")) {
					System.out.println("구구단 출력 프로그램을 종료합니다.");
					break;
				}
				// y가 아닌 문자를 입력할 경우
				else if(!res.equalsIgnoreCase("y")) {
					System.out.println("잘못된 입력입니다.");
					System.out.println("구구단 출력 프로그램을 종료합니다.");
					break;
				}
				// y를 입력한 경우
				else {
					System.out.println("2~19까지의 숫자를 입력하세요! (-1을 입력하면 종료됩니다)");
				}
				
			}
			
			// 2~19사이의 숫자가 아닌 다른 숫자를 입력하면 경고
			else {
				System.out.println("기입하신 숫자를 다시 확인해서 입력하세요.");
				System.out.println("※2~19까지의 숫자만 가능");
			}
			
			
		}
	
		
	}
	
}
