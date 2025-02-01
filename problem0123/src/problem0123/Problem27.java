package problem0123;

/**
 * 문제27)
 * Animal 클래스로 여러가지 인스턴스를 만들어보세요.
	- 강아지 인스턴스 여러개
	- 고양이 인스턴스 여러개 등등
 */
public class Problem27 {

	public static void main(String[] args) {
		
		// 강아지 인스턴스
		Animal dog1 = new Animal("동동", "강아지", "멍멍");
		Animal dog2 = new Animal("히동", "강아지", "왕왕");
		Animal dog3 = new Animal("이룸", "강아지", "월월");
		dog1.introduce();
		dog2.cry();
		
		// 고양이 인스턴스
		Animal cat1 = new Animal("감자", "고양이", "냐옹");
		Animal cat2 = new Animal("보리", "고양이", "야옹");
		Animal cat3 = new Animal("순대", "고양이", "애옹");
		cat1.introduce();
		cat2.cry();
	}
	
}
