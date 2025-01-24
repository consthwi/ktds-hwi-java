package movie;

public class DownTown {
	
//	public static void addNumber(int number) {
//		number += 10;
//		System.out.println(number); // 2. 20
//		// 메소드가 종료되면 지역변수+param은 사라진다.
//	}
//	
//	public static void appendName(String lastName) {
//		lastName += "휘원";
//		System.out.println(lastName); // 2. "강휘원"
//	}
//	
//	public static void setMovieTitle(Movie movie) {
//		movie.title = "파묘";
//		System.out.println(movie.title);
//	}
	
	public static void main(String[] args) {
		
//		int number = 10;
//		System.out.println(number); // 1. 10
//		addNumber(number);
//		System.out.println(number); // 3. 10
//		
//		String name = "강";
//		System.out.println(name); // 1. "강"
//		appendName(name);
//		System.out.println(name); // 3. "강"
		// String은 referenceType이지만 "읽기전용"이다.
		// **따라서 String으로 지정된 번지수내의 값은 변경되지 않는다.
		
//		Movie pamyo = new Movie();
//		System.out.println(pamyo.title);
//		setMovieTitle(pamyo);
//		System.out.println(pamyo.title);
		// primitiveType의 값은 
		// 메소드내에서 사용한 param으로 인해 변수값이 변경될 경우,
		// 메모리주소가 변경되어(e.g id=48 -> id=54) 값을 처리되고,
		// 메소드가 종료되면 사용한 메모리주소(e.g id=54)는 사라진다.
		
		// referenceType의 값은 
		// 메소드내에서 사용한 param으로 인해 변수값이 변경될 경우,
		// *같은 메모리주소를 공유하기 때문에(e.g id=48),
		// 값을 처리한 경우 참조한 메모리주소(e.g id=48)의 값을 변경한 경우,
		// 메소드가 종료된 이후에 참조한 메모리주소의 값은 수정된다.
		
		// ** String만 예외
		// ** referenceType의 값을 메소드내에서 param으로 처리할 경우,
		//    메모리주소가 전달되어 처리되기 때문에,
		//    메모리주소로 찾아가 참조된 본값을 변경한다. (실제 참조값 업데이트)
		
		
		
		Theater cgv = new Theater();
//		System.out.println(cgv);
		
		Movie harbin = new Movie();
		harbin.title = "하얼빈";
		harbin.runningTime = 120;
		
		Seat h6 = new Seat();
		h6.seatNumber = "h6";
		h6.isFold = true;

		Speaker harman = new Speaker();
		harman.volume = 50;
		harman.isOn = false;
		
		AirConditioner carrier = new AirConditioner();	
		
		Projector miniBeam = new Projector();
		miniBeam.isOn = true;
		
		Light sony = new Light();
		sony.color = "대충 노란색";
		sony.isOn = true;
		
		// 생성된 cgv 인스턴스에
		// 클래스로 새로 생성된 인스턴스번지값 할당
		cgv.movie = harbin;
		cgv.seat = h6;
		cgv.speaker = harman;
		cgv.light = sony;
		cgv.airConditioner = carrier;
		cgv.projector = miniBeam;
		
		cgv.playMovie();
		cgv.playMovie();
		
		cgv.turnOnAirConditioner();
		cgv.turnOnAirConditioner();
		
		cgv.turnOnLight();
		cgv.turnOnLight();
		
		cgv.controlVolume(50);
		cgv.controlVolume(60);
		cgv.controlVolume(-70);
		cgv.controlVolume(-50);
		
		cgv.controlSeat();
		cgv.controlSeat();
		
		// ==============================
		
		
		
		// 자료형 기본값
		// Primitive type
		// 숫자 0
		// boolean false
		// char 0 ''
		
		// Reference type
		// String null
		// null
	}
	
}
