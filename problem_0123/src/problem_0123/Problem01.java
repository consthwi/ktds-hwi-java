package problem_0123;

public class Problem01 {
	public static void main(String[] args) {
		
		int clientValance = 10000;
		int movieCost = 18000;
		
		// 손님잔고가 영화비용보다 크면 영화관람 가능
		if(clientValance > movieCost) {
			System.out.println("잔고가 충분하여 영화관람이 가능합니다.");
			System.out.println("남은 금액은 "+(clientValance-movieCost)+"원 입니다.");
		}
		// 그렇지 않으면 영화관람 불가능
		else {
			System.out.println("잔고가 충분하지 않아 영화관람이 불가능합니다.");
			System.out.println("모자란 금액은 "+(movieCost-clientValance)+"원 입니다.");
		}
		
	}
}
