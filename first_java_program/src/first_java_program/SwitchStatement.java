package first_java_program;

public class SwitchStatement {

	public static void main(String[] args) {
		
		// java 1.6 switch 
		int step = 1;
		
		// 라면 끓이기 절차를 출력해보기
		switch (step) {
		case 1:
			System.out.println("01. 수납장 손잡이를 잡아 문을 연다.");
		case 2:
			System.out.println("02. 수납장에서 냄비 손잡이를 잡아 꺼낸다.");
		case 3:
			System.out.println("03. 냄비를 세척해야할지 판단한다.");
		case 4:
			int rndNum = (int)(Math.random()*10);
			System.out.println(rndNum);
			if(rndNum % 2 == 0) {
				System.out.println("04. 냄비가 깨끗하다면 가스레인지에 올린다.");
			} 
			else if(rndNum == 9) {
				System.out.println("04. 냄비를 씻다가 떨어뜨려 깨져버렸다. 굶는다.");
				break;
			}
			else {
				System.out.println("04. 냄비가 더럽다면 씻어서 가스레인지에 올린다.");
			}
			
			
		case 5:
			System.out.println("05. 냉장고로 걸어가 문을 열고 생수를 꺼내서 뚜껑을 열어 냄비에 물을 550ml만큼 따른다.");
		case 6:
			System.out.println("06. 가스레인지에 불을 켠다.");
		case 7:
			System.out.println("07. 수납장에서 라면을 꺼낸다.");
		case 8:
			System.out.println("08. 라면 봉지를 뜯는다.");
		case 9:
			System.out.println("09. 후레이크 스프를 꺼내 뜯어 냄비에 붓는다.");
		case 10:
			System.out.println("10. 물이 끓으면 면을 꺼내서 냄비에 넣는다.");
		case 11:
			System.out.println("11. 분말스프를 꺼내 뜯어 냄비에 붓는다.");
		case 12:
			System.out.println("12. 정해진 시간을 지켜 기다린다.");
		case 13:
			System.out.println("13. 정해진 시간이 지나면 가스레인지 불을 끈다.");
		case 14:
			System.out.println("14. 그릇을 찾는다.");
		case 15:
			System.out.println("15. 수저를 찾는다.");
		case 16:
			System.out.println("16. 찾은 그릇과 수저를 식탁에 세팅한다.");
		case 17:
			System.out.println("17. 냄비를 가스레인지에서 내용물을 옮겨 그릇에 붓는다.");
		case 18:
			System.out.println("18. 맛있게 먹는다.");
		}
		
		// Switch를 이용해서 변수에 값을 할당한다.		
		// Java 13 switch
		// 회원가입을 받을 떄, 사용자가 등록할 수 없는 아이디 목록. (black list)
		// 관리자들이 사용하는 아이디
		// admin, root, superuser, administrator
		// 운영자들이 사용하는 아이디
		// master, operator, system, sysopr
		
		String memberId = "user";
		String memberGrade = switch(memberId) {
			case "admin":
			case "root":
			case "superuser":
			case "administrator":
				yield "관리자";
				// yield... break(return)과 유사
			case "master":
			case "operator":
			case "system":
			case "sysopr":
				yield "운영자";
			default: 
				yield "일반사용자";
		};
		
		System.out.println("Switch1) "+memberId + "는 "+memberGrade+"입니다.");
		
//		==============================
		
		// Java 14 switch
		String memberId2 = "superuser";
		String memberGrade2 = switch(memberId2) {
			case "admin", "root", "superuser", "administrator":
				yield "관리자";
				// yield... break(return)과 유사
			case "master", "operator", "system", "sysopr":
				yield "운영자";
			default: 
				yield "일반사용자";
		};
		
		System.out.println("Switch2) "+memberId2 + "는 "+memberGrade2+"입니다.");
		
//		==============================
		// yield 간소화 => 배열, 자료구조 => 한 줄로 표현가능.
		// switch는 값의 return이 가능
		
		String memberId3 = "system";
		String memberGrade3 = switch(memberId3) {
			case "admin", "root", "superuser", "administrator" -> "관리자";
			case "master", "operator", "system", "sysopr" -> "운영자";
			default -> "일반사용자";
		};
		
		System.out.println("Switch3) "+memberId3 + "는 "+memberGrade3+"입니다.");
		
	}
	
}
