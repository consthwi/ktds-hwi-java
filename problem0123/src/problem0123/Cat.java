package problem0123;

/**
 * 문제28)
 * Cat 클래스를 만들어보세요
 * 속성
	이름
	종류 (코리안 숏헤어, 노르웨이 숲, 메인쿤, 렉돌 등등)
	크기 (대형, 중형, 소형 등등)
 * 기능
	생성자
	소개하기
	울기
 */
public class Cat {

	// 멤버 변수(속성, 필드)
	private String name;
	private String type;
	private String size;
	
	// 생성자
	public Cat(String name, String type, String size) {
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	// 메서드1) 소개하기
	public void introduce() {
		System.out.println("저는 "+this.size+" "+this.type+"인 "+this.name+"입니다냥");
		System.out.println("잘부탁드립니다냥");
	}
	
	// 메서드2) 울기
	public void cry() {
		System.out.println(this.name+"이(가) 갑자기 울기 시작합니다.");
		System.out.println("냐냐냥");
	}
	
	
}
