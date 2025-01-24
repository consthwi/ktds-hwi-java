package movie;

public class Movie {
	
	// main메소드에 속하지 않은
	// 멤버변수1... 필드
	String title;
	// 멤버변수2
	int runningTime;
	
	public void printMovieInformation() {
		System.out.println("Movie title: "+this.title);
		System.out.println("Movie runningTime: "+this.runningTime);
		// Movie class로 생성한 인스턴스에서 사용
	}
	
}
