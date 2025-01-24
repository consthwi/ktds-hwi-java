package vendingmachine;

public class Mart {
	
	public static void main(String[] args) {
		
		Item bakkas = new Item("박카스", 900, 15);
		Item monster = new Item("몬스터", 1500, 20);
		Item hotsix = new Item("핫식스", 1300, 10);
		Item milkis = new Item("밀키스", 1400, 5); 
		
		VendingMachine vm1 = new VendingMachine(bakkas, monster, hotsix, milkis);
		
		vm1.pressItemButton("박카스", 11);
		System.out.println(vm1.item1.name+"을(를) 주문했습니다.");
		System.out.println("현재 상품의 재고는 "+vm1.item1.stock+"개입니다.");
		
		vm1.addItem("밀키스", 3);
		vm1.addItem("밀키스", 3);
		
		vm1.showAllStock();
		
	}
}
