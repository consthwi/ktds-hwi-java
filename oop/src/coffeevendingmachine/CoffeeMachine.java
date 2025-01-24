package coffeevendingmachine;

public class CoffeeMachine {
	
	// 1. 데이터 할당 ... 초기값은 할당하지 않는다
	Coffee item1;
	Coffee item2;
	Coffee item3;
	Coffee item4;
	
	// 2. 생성자 ... 커피 아이템을 파라미터로 추가하기 위함
	//e.g) CoffeeMachine ktdsCoffeeMachine = new CoffeeMachine("밀크", "프림", "슈가", "블랙");
	public CoffeeMachine(Coffee item1, Coffee item2, Coffee item3, Coffee item4) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
	}
	
	// 3. 메서드
	/**
	 * 1. 주문버튼을 누를 경우, 데이터가 갱신된 Coffee가 가진 데이터를 출력
	 * @param itemName
	 * @param orderCount
	 * @return 갱신된 커피 객체
	 */
	public Coffee pressItemButton(String itemName, int orderCount) {
		if(itemName == this.item1.name) {
			if(this.item1.stock >= orderCount) {
				this.item1.stock -= orderCount;
				Coffee updateResult = new Coffee(this.item1.name, this.item1.price, this.item1.stock);
				return updateResult;
			} else {
				System.out.println(this.item1.name+"커피의 재고가 부족하여 상품구매에 실패했습니다.");
				return null;
			}
		}
		else if(itemName == this.item2.name) {
			if(this.item2.stock >= orderCount) {
				this.item2.stock -= orderCount;
				Coffee updateResult = new Coffee(this.item2.name, this.item2.price, this.item2.stock);
				return updateResult;
			} else {
				System.out.println(this.item2.name+"커피의 재고가 부족하여 상품구매에 실패했습니다.");
				return null;
			}
		}
		else if(itemName == this.item3.name) {
			if(this.item3.stock >= orderCount) {
				this.item3.stock -= orderCount;
				Coffee updateResult = new Coffee(this.item3.name, this.item3.price, this.item3.stock);
				return updateResult;
			} else {
				System.out.println(this.item3.name+"커피의 재고가 부족하여 상품구매에 실패했습니다.");
				return null;
			}
		}
		else if(itemName == this.item4.name) {
			if(this.item4.stock >= orderCount) {
				this.item4.stock -= orderCount;
				Coffee updateResult = new Coffee(this.item4.name, this.item4.price, this.item4.stock);
				return updateResult;
			} else {
				System.out.println(this.item4.name+"커피의 재고가 부족하여 상품구매에 실패했습니다.");
				return null;
			}
		}
		else {
			System.out.println("주문하고자 하는 상품명을 다시 확인해주세요.");
			return null;
		}
	}
	
	public void addItemStock(String itemName, int addCount) {
		if(itemName == this.item1.name) {
			this.item1.stock += addCount;
			System.out.println("성공적으로 재고를 추가했습니다.");
			System.out.println(this.item1.name+"커피의 남은 재고는 "+this.item1.stock+"잔 입니다.");
		}
		else if(itemName == this.item2.name) {
			this.item2.stock += addCount;
			System.out.println("성공적으로 재고를 추가했습니다.");
			System.out.println(this.item2.name+"커피의 남은 재고는 "+this.item2.stock+"잔 입니다.");
		}
		else if(itemName == this.item3.name) {
			this.item3.stock += addCount;
			System.out.println("성공적으로 재고를 추가했습니다.");
			System.out.println(this.item3.name+"커피의 남은 재고는 "+this.item3.stock+"잔 입니다.");
		}
		else if(itemName == this.item4.name) {
			this.item4.stock += addCount;
			System.out.println("성공적으로 재고를 추가했습니다.");
			System.out.println(this.item4.name+"커피의 남은 재고는 "+this.item4.stock+"잔 입니다.");
		}
		else {
			System.out.println("추가하고자 하는 상품명을 다시 확인하세요.");
		}
	}
	
	public void showAllStock() {
		System.out.println("****KT ds 커피자판기 재고량****");
		System.out.println(this.item1.name+": "+this.item1.stock+"잔");
		System.out.println(this.item2.name+": "+this.item2.stock+"잔");
		System.out.println(this.item3.name+": "+this.item3.stock+"잔");
		System.out.println(this.item4.name+": "+this.item4.stock+"잔");
	}
	
	
	
	
	
	
}
