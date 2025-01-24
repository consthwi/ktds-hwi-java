package first_java_program;

public class IfStatement {

	public static void main(String[] args) {
		// f11 debug 시작
		
		// 커피 가격
		int coffeePrice = 1500;
		// 통장 잔고
		int myValance = (int)(Math.random()*10000);		
		// 친구 잔고
		int friendsValance = (int)(Math.random()*5000);
		
		// 내가 커피 5잔을 사 먹을 수 있을까?
		// 잔고 >= 커피 총액
		boolean canBuy = coffeePrice * 5 <= myValance;
	
		System.out.println("현재 잔고는 "+myValance+"입니다.\n커피 구매가 가능합니까?: "+canBuy);
		
		// case1)
		// 내가 커피를 구매할 수 있으면, "커피 주문 완료했습니다"라고 출력 + 잔고에서 커피가격을 제한다.
		// 내가 커피를 구매할 수 없으면, "커피 주문에 실패했습니다"라고 출력 + 모자란 금액 출력
		
		// case3)
		// 내가 커피를 구매할 수 없으면,
		// 친구가 모자란 만큼의 돈을 가지고 있으면 돈을 빌려서 커피를 주문한다.
		// => "친구에게 돈을 빌려서 커피를 주문했습니다."를 출력하고 빌린 돈을 출력한다.
		
		// case4)
		// 내가 커피를 구매할 수 없으면,
		// 친구가 모자란 만큼의 돈을 가지고 있지도 않는 상황.
		// 그런데, 4잔까지는 사 먹을 수 있는 돈이 친구에게 있다면
		// "친구에게 모자란 금액만큼 빌려서 4잔을 주문했습니다."라고 출력한다.
		
		if(canBuy) {
			myValance = myValance - coffeePrice*5;
			System.out.println("커피 주문 완료했습니다.\n현재 잔고는 "+myValance+"입니다.");
		} else if(friendsValance >= (coffeePrice*5) - myValance) {
			// canBuy가 false && 친구 잔고 >= 모자란 금액
			System.out.println("친구가 가진 잔고는 "+friendsValance+"입니다.");
			int loan = (coffeePrice*5) - myValance;
			System.out.println("친구에게 돈을 빌려서 커피 주문 완료했습니다.\n빌린 금액은 "+loan+"입니다.");
		} else if(friendsValance >= (coffeePrice*4) - myValance) {
			System.out.println("친구가 가진 잔고는 "+friendsValance+"입니다.");
			int loan = (coffeePrice*4) - myValance;
			System.out.println("친구에게 돈을 빌려서 커피 4잔이나마 주문 완료했습니다.\n빌린 금액은 "+loan+"입니다.");
		} else {
			int needMoney = coffeePrice*5 - myValance;
			System.out.println("커피 주문에 실패했습니다.\n모자란 금액은 "+needMoney+"입니다");
		}
		
		
		
		
	}
	
}
