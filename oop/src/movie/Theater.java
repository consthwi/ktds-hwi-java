package movie;

// 설계도, 라이브러리 클래스
public class Theater {
	
	// 속성 (상영관이 가지고 있는 것들)
	// 영화정보 - 영화제목, 러닝타임
	Movie movie;
	
	// 좌석정보 - 좌석번호, 좌석상태
	Seat seat;
	
	// 스피커정보 - 볼륨, 전원여부
	Speaker speaker;
	
	// 조명정보 - 색깔, 전원여부
	Light light;
	
	// 에어컨정보 - 전원여부, 세기, 현재온도, 목표온도, 난방/냉방여부
	AirConditioner airConditioner;
	
	// 프로젝터정보 - 전원여부, 재생여부
	Projector projector;
	
	// 기능 (상영관이 할 수 있는 것들)
	// 라이브러리 클래스 내의 메소드는 static을 사용하지 않는다.
	// 1. 재생한다.
	//  - projector !isOn? isOn -> true
	// 	- projector isOn? isPlay -> true
	//	- projector isPlay? movie.title을 러닝타임동안 재생
	//	- projector isPlay -> false, isOn -> false
	public void playMovie(){
		
		if(!projector.isOn) {
			projector.isOn = true;
		}
		
		if(projector.isOn) {
			projector.isPlay = true;
			
			if(projector.isPlay) {
				System.out.println(movie.title+"을 "+movie.runningTime+"분 동안 재생합니다.");
				projector.isPlay = false;
				projector.isOn = false;
			}
		}
		
	}
	
	// 2. 에어컨을 켠다.
	//	- airConditioner !isOn? isOn -> true
	//		- 현재온도, 세기, 냉/난방, 목표온도
	public void turnOnAirConditioner() {
		if(!airConditioner.isOn) {
			airConditioner.isOn = true;
			
			airConditioner.nowTemperature = (float)Math.random()*40;
			airConditioner.windSpeed = (int)(Math.random()*4);
			airConditioner.aimTemperature = (float)(Math.random()*4);
			
			boolean isNowWinter = airConditioner.nowTemperature < airConditioner.aimTemperature;
			airConditioner.isCooling = !isNowWinter;
		}
	}
	
	// 3. 조명을 끄고 켠다.
	//	- light isOn? false : true
	//	  light isOn? light.color지정
	//	  light !isOn? light.color = null
	//	- color를 지정하는 방법:
	//		0~2중의 임의의 난수를 받아서 0이면 "RED", 1이면 "BLUE", 2이면 "GREEN"
	public void turnOnLight() {
		
		if(light.isOn) {
			light.isOn = false;
			
			int rndColorIndex = (int)(Math.random()*3);
			if(rndColorIndex == 0) {
				light.color = "RED";
			}
			else if(rndColorIndex == 1) {
				light.color = "BLUE";
			}
			else {
				light.color = "GREEN";
			}
			
		} else {
			light.isOn = true;
			
			light.color = null;
		}
		
	}
	
	// 4. 볼륨을 조절한다.
	//	- speaker !isOn? isOn -> true
	//	- speaker isOn? -> speaker.volume
	//		-volume 지정방식
	//			숫자(정수)를 파라미터로 받아와서 볼륨에 더해 할당하거나 뺀다.
	// 		-volume 지정조건
	//			증가된 볼륨의 값이 100초과된다면 100으로 변경
	//			감소된 볼륨의 값이 0미만이라면 0으로 변경
	
	public void controlVolume(int inputValue) {
		
		if(speaker.isOn) {
			
			if(speaker.volume + inputValue > 100) {
				speaker.volume = 100;
			}
			else if(speaker.volume + inputValue < 0) {
				speaker.volume = 0;
			}
			else {
				speaker.volume += inputValue;
			}
			
		} else {
			speaker.isOn = true;
		}
		
	}
	
	// 5. 의자를 조정한다.(접고 편다)
	//	- seat isFold? false : true (toggle)
	//	- 변경된 후 seat isFold? "seat.seatNumber가 접혔습니다." 출력
	//			 seat !isFold? "seat.seatNumber가 펼쳐졌습니다." 출력
	public void controlSeat() {
		seat.isFold = !seat.isFold;
		if(seat.isFold) {
			System.out.println(seat.seatNumber+"가 접혔습니다.");
		} else {
			System.out.println(seat.seatNumber+"가 펼쳐졌습니다.");
		}
	}
}
