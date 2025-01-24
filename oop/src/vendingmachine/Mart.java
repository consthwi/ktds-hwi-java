package vendingmachine;

// Summary
// 클래스 -> 추상정보
//   -> 인스턴스(객체) -> 구체정보

// null. -> NullPointerExcepation Error 주의


/**
 * 자판기를 생성하고 판매/운영 수행
 */
public class Mart {
	
	public static void main(String[] args) {
		
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 인스턴스들 생성
		Item bakkas = new Item("박카스", 900, 15);
		Item monster = new Item("몬스터", 1500, 20);
		Item hotsix = new Item("핫식스", 1300, 10);
		Item milkis = new Item("밀키스", 1400, 5); 
		
		// 자판기 인스턴스를 생성
		// 자판기가 판매할 상품의 구체적인 정보를 가지고 있는 상품 인스턴스도 함께 전달한다.
		VendingMachine vm1 = new VendingMachine(bakkas, monster, hotsix, milkis);
		
		// 자판기에서 상품 버튼을 눌러 구매한다.
		// 반환된 정보는 구매자가 구매한 상품정보.
		// vm1.pressItemButton("박카스", 11);
		// System.out.println(vm1.item1.name+"을(를) 주문했습니다.");
		// System.out.println("현재 상품의 재고는 "+vm1.item1.stock+"개입니다.");
		Item orderedItem = vm1.pressItemButton("박카스", 11);
		
		// *null체크 중요
		// orderedItem이 null일 경우를 대비해 조건문 작성
		if(orderedItem != null) {
			System.out.println(orderedItem.name+"을(를) 주문했습니다.");
			System.out.println("현재 상품의 재고는 "+orderedItem.stock+"개입니다.");	
		}
		else {
			System.out.println("주문이 취소되었습니다.");
		}
		
		vm1.addItem("밀키스", 3);
		vm1.addItem("밀키스", 3);
		
		vm1.showAllStock();
		
	}
}
