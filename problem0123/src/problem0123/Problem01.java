package problem0123;

/**
 * 문제1)
 * 손님이 영화를 관람할 수 있을지 여부 판단
 */
public class Problem01 {
	public static void main(String[] args) {
		
		final int movieCost = 18000;
		// int guestMoney = 10000;
		// 15000 ~ 25000 난수 생성
		int guestMoney = (int)(Math.random()*10001 + 15000);
		// 100의 자리 이하는 0으로 처리
		guestMoney = (int) (Math.floor(guestMoney/100) * 100);
		System.out.println("현재 손님은 "+guestMoney+"원을 보유하고 있습니다.");
		
		// 손님잔고가 영화비용보다 크면 영화관람 가능
		if(guestMoney > movieCost) {
			System.out.println("잔고가 충분하여 영화관람이 가능합니다.");
			System.out.println("남은 금액은 "+(guestMoney-movieCost)+"원 입니다.");
		}
		// 그렇지 않으면 영화관람 불가능
		else {
			System.out.println("잔고가 충분하지 않아 영화관람이 불가능합니다.");
			System.out.println("모자란 금액은 "+(movieCost-guestMoney)+"원 입니다.");
		}
		
	}
}
