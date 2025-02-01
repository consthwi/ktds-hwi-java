package problem0123;

/**
 * 문제26)
 * Animal 클래스를 만들어보세요.
 * 멤버변수
	이름
	종류 (강아지, 고양이 등등)
	울음소리
 * 메소드
	생성자
	소개하기
	울기
 */
public class Animal {
	
	// 멤버 변수
	private String name;
	private String type;
	private String sound;
	
	// 생성자
	public Animal(String name, String type, String sound) {
		this.name = name;
		this.type = type;
		this.sound = sound;
	}
	
	// 메서드1) 소개하기
	public void introduce() {
		System.out.println("안녕하세요 "+this.sound);
		System.out.println("저는 "+this.type+"고 이름은 "+this.name+"입니다.");
	}
	
	// 메서드2) 울기
	public void cry() {
		System.out.println(this.name+"이(가) 울기 시작했습니다.");
		System.out.println(this.sound+"~!");		
	}
	
	
}
