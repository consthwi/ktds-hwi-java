package cafe;

public class MainStreet {
	
	public static void main(String[] args) {
		
		CoffeeShop megaCoffee = new CoffeeShop(2500, 2000);
		megaCoffee.iceAmericano += 500;
		
		System.out.println(megaCoffee);
		System.out.println("메가커피의 아이스아메리카노 가격: "+megaCoffee.iceAmericano);
		System.out.println("메가커피의 핫아메리카노 가격: "+megaCoffee.hotAmericano);

		int megaOrderPrice = megaCoffee.orderCoffee(1, 5);
		System.out.println("메가커피에서 주문한 총 주문금액은 "+megaOrderPrice+"원 입니다.");
		System.out.println("=================================");

		
		CoffeeShop starbucks = new CoffeeShop(6000, 6000);
//		starbucks.iceAmericano = 6000;
//		starbucks.hotAmericano = 6000;
		System.out.println(starbucks);
		System.out.println("스타벅스의 아이스아메리카노 가격: "+starbucks.iceAmericano);
		System.out.println("스타벅스의 핫아메리카노 가격: "+starbucks.hotAmericano);
		
		int starbucksOrderPrice1 = starbucks.orderCoffee(2, 3);
		System.out.println("스타벅스에서 주문한 총 주문금액은 "+starbucksOrderPrice1+"원 입니다.");
		
		int starbucksOrderPrice2 = starbucks.orderCoffee(99, 3);
		System.out.println("스타벅스에서 주문한 총 주문금액은 "+starbucksOrderPrice2+"원 입니다.");
		
		
	}
	
}
