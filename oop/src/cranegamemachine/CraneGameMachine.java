package cranegamemachine;

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {		
		if(dolls > 0) {
			isInsertCoin = true;
			System.out.println("동전을 투입했습니다.");
			System.out.println("현재 게임기에 남은 인형의 개수는 "+dolls+"개 입니다.");
		}
		else {
			System.out.println("인형 재고가 부족해 게임진행이 불가능합니다.");
		}
	}
	
	public void doGame() {

		System.out.println("게임이 시작됩니다. (성공확률 50%)");
		// 동전이 투입되어 있는 경우
		if(isInsertCoin) {
			// 0 Lose , 1 Win
			int loseOrWin = (int)(Math.random()*2);
			
			// 0이 나와 진 경우 0반환
			if(loseOrWin == 0) {
				System.out.println("인형뽑기에 실패하셨습니다.");
				isInsertCoin = false;
			}
			// 1이 나와 이긴 경우 1반환
			else {
				dolls--;
				System.out.println("인형뽑기에 성공하셨습니다!");
				System.out.println("현재 게임기에 남은 인형 수는 "+dolls+"개 입니다.");
				isInsertCoin = false;
			}
		}
		// 동전이 투입되지 않은 경우
		else {
			System.out.println("우선 동전을 투입하세요");
		}
		
	}
	
	public int printGameResult() {
		if(isInsertCoin) {
			System.out.println("인형뽑기 게임을 시작합니다. (성공확률 50%)");
			int lose0OrWin1 = (int)(Math.random()*2);
			// 이기든 지든 dolls를 1또는 0의 값을 결과가 제하면 같다
			dolls -= lose0OrWin1;
			isInsertCoin = false;
			return lose0OrWin1;
		}
		System.out.println("우선 동전을 투입하세요");
		return 0;
	}
}
