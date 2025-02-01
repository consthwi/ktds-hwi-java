package problem0123;

/**
 * 문제29)
 * Cat 클래스로 여러가지 인스턴스를 만들어보세요
 */
public class Problem29 {

	public static void main(String[] args) {
		
		// Cat 인스턴스 생성
		Cat cat1 = new Cat("감자", "코숏", "중형");
		cat1.introduce();
		
		Cat cat2 = new Cat("세자", "렉돌", "대형");
		cat2.cry();
		
	}
	
}
