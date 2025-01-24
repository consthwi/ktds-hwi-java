package first_java_program;

public class Project1 {
	public static void main(String[] args) {
		// 1.
//		int minute = 5;
//		int seconds = 50;
//		int time = 0;
//		
//		time = (minute * 60) + 50;
//		System.out.println(minute+"분"+seconds+"초는 총 "+time+"초 만큼의 시간입니다.");
		
		// 2.
		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
//		
		minutes = processTime / 60;
		seconds = processTime % 60;
//		
//		System.out.println(minutes);
//		System.out.println(seconds);
		System.out.println(processTime+"초의 시간은 "+minutes+"분 "+seconds+"초입니다.");
		
//		int celsius = 30;
//		int fahrenheit = 0;
//		double fomular = (double) 9/5;
////		System.out.println(fomular);
//		double result = (30 * fomular) + 32;
////		System.out.println(result);
//		fahrenheit = (int) result;
		
		double celsius = 36.5;
		// => celsius가 double이면 celsius를 포함한 연산식이 double로 형변환된다.
		double fahrenheit = (celsius * 9/5)+32;
//		System.out.println(fahrenheit);
		System.out.println("섭씨"+celsius+"C는 화씨"+fahrenheit+"F와 같습니다.");
	}
}
