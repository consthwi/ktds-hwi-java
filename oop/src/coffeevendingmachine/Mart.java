package coffeevendingmachine;

public class Mart {
	
	public static void main(String[] args) {
		
		// 데이터필드 세팅
		Coffee milk = new Coffee("밀크", 500, 10);
		Coffee prim = new Coffee("프림", 300, 20);
		Coffee sugar = new Coffee("슈가", 600, 15);
		Coffee black = new Coffee("블랙", 200, 8);
		
		CoffeeMachine ktdsCm = new CoffeeMachine(milk, prim, sugar, black);
		
		ktdsCm.pressItemButton("밀크", 2);
		System.out.println(ktdsCm.item1.name+"커피를 주문했습니다.");
		System.out.println(ktdsCm.item1.name+"커피는 "+ktdsCm.item1.stock+"잔 남았습니다.");
		
		ktdsCm.addItemStock("슈가", 3);
		
		ktdsCm.showAllStock();
		
		// ==== 기능
		// 1. 주문하기
		// 주문버튼을 누를 경우, 데이터가 갱신된 Coffee가 가진 데이터를 출력
		// => return new Coffee();
		// pressItemButton(String itemName, int orderCount)
		
		// 2. 재고추가하기
		// addItemStock(String itemName, int addCount)
		
		// 3. 재고출력하기 void
		// showAllStock();
		
	}
	
}
