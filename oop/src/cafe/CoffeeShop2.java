package cafe;

public class CoffeeShop2 {
	
	// 3. Coffee클래스로 두 인스턴스 객체를 생성한다.
	// => 생성한 iceAmericano, hotAmericano는
	//	  Coffee클래스에서 정의한 속성을 상속받는다.
	//    e.g) name, price ... 아직 정의 x
	Coffee iceAmericano;
	Coffee hotAmericano;
	// 클래스가 클래스 데이터필드를 가진다. (has a)
	
	// 4. CoffeeShop2클래스에서 3에서 생성한 객체의 데이터를 재할당한다.
	//	  => Coffee클래스로 생성된 두 인스턴스는 초기값이 없으므로,
	//	     재할당하기 위한 값을 파라미터로 받는다.
	//       파라미터를 사용하기 위해 생성자를 만든다.
	public CoffeeShop2(Coffee iceAmericano, Coffee hotAmericano) {
		this.iceAmericano = iceAmericano;
		// CoffeeShop2.iceAmericano의 하위 폴더를 만드는 작업.
		// => 1) CoffeeShop2 클래스로 생성되는 객체(pascussi)의 iceAmericano에
		//    2) 파라미터로 객체(ice)를 할당한다.
		this.hotAmericano = hotAmericano;
	}
	//	Coffee ice = new Coffee("아이스아메리카노", 3500); => ice객체 생성
	//	CoffeeShop2 pascucci = new CoffeeShop2(ice, hot);
	
	// 5. 주문 총 금액을 return하는 메소드를 작성한다.
	//    CoffeeShop2에서 생성한 객체(커피숍)의 메서드(커피주문)
	public int orderCoffee(int menu, int quantity) {
		
		if(menu == 1) {
			System.out.println(this.iceAmericano.name+"을(를) "+quantity+"잔 주문했습니다.");
			return this.iceAmericano.price * quantity;
		}
		else if(menu == 2) {
			System.out.println(this.hotAmericano.name+"을(를) "+quantity+"잔 주문했습니다.");
			return this.hotAmericano.price * quantity;
		}
		
		return 0;
	}
	
	// main메소드 정의
	public static void main(String[] args) {
		
		// CoffeeShop2의 속성(메뉴)
		Coffee ice = new Coffee("아이스아메리카노", 3500);
		Coffee hot = new Coffee("핫아메리카노", 3000);
		
		// CoffeeShop2의 기능
		CoffeeShop2 pascucci = new CoffeeShop2(ice, hot);

		// 아이스아메리카노 (menu: 1) 5잔 주문
		int totalCost1 = pascucci.orderCoffee(1, 5);
		System.out.println("주문 금액은 총 "+totalCost1+"입니다.");
		
		// 핫아메리카노 (menu: 2) 3잔 주문
		int totalCost2 = pascucci.orderCoffee(2, 3);
		System.out.println("주문 금액은 총 "+totalCost2+"입니다.");
		
	}
	
}
