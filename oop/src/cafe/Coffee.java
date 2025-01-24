package cafe;

public class Coffee {
	
	// 1. Coffee 클래스로 생성할 때 가지고 있는 속성을 정의한다.
	String name;
	int price;
	
	// 2. Coffee 클래스로 instance객체의 생성을 목표로 한다.
	// e.g) hot, ice...
	public Coffee(String name, int price) {
		// Coffee 클래스로 생성할 객체는 파라미터를 쓴다.
		// 파라미터를 기입하여 클래스를 생성하기 위해 생성자를 사용한다.
		this.name = name;
		this.price = price;
	}
	
}
