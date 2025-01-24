package cranegamemachine;

public class GameCenter {
	public static void main(String[] args) {
		CraneGameMachine machine1 = new CraneGameMachine();
		
		machine1.dolls = 10;

//		machine1.insertCoin();
//		machine1.doGame();		
//		machine1.insertCoin();
//		machine1.doGame();
		
		int result = 0;
		int gameCount = 0;
		while(true) {
			
			machine1.insertCoin();
			gameCount++;
			result += machine1.printGameResult();
			System.out.println(gameCount+"회 게임 결과: 인형 "+result+"개");
			
			if(machine1.dolls == 0) {
				break;
			}
		}
		
//		machine1.insertCoin();
//		int gameResult = machine1.printGameResult();
//		System.out.println("뽑은 인형의 개수는 "+gameResult+"개 입니다.");
	}
}
