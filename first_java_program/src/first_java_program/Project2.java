package first_java_program;

public class Project2 {
	
	public static void main(String[] args) {
		// Problem1)
//		int korScore = 90;
//		int engScore = 88;
//		int mathScore = 70;
//		int progScore = 80;
//		
//		int sum = 0;
//		int average = 0;
//		
//		sum = korScore + engScore + mathScore + progScore;
//		average = sum / 4;
//		
//		System.out.println("과목점수 총합: "+sum);
//		System.out.println("과목점수 평균: "+average);
//		
//		if(average >= 95) {
//			System.out.println("A+");
//		} else if(average >= 90) {
//			System.out.println("A");
//		} else if(average >= 85) {
//			System.out.println("B+");
//		} else if(average >= 80) {
//			System.out.println("B");
//		} else if(average >= 70) {
//			System.out.println("C");
//		} else {
//			System.out.println("F");
//		}
		
		// Problem2)
		int money = (int)(Math.random()*500_000+500_000);
		
		int father = (int)(Math.random()*70+15);
		int mother = (int)(Math.random()*70+15);
		int daughter = (int)(Math.random()*40+1);
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int adultFareSum = 0;
		int kidFareSum = 0;
		int totalFare = 0;
		
		System.out.println("가지고 있는 돈은 "+money+"입니다.");
		System.out.println("아빠의 나이는 "+father+"입니다.");
		System.out.println("엄마의 나이는 "+mother+"입니다.");
		System.out.println("딸의 나이는 "+daughter+"입니다.");
		
		if(father >= 19 && mother >= 19) {
			adultFareSum += adultOneWayFlightFare*2;
			totalFare = adultFareSum;
			System.out.println("아빠와 엄마는 성인입니다. \n부모님의 여행비용 합은 "+totalFare+"입니다.");
		} else if(father < 19 && mother >= 19) {
			// 아빠 또는 엄마가 성인이 아닌 경우 중 아빠가 19미만인 경우
			adultFareSum += adultOneWayFlightFare;
			kidFareSum += kidOneWayFlightFare;
			totalFare = adultFareSum + kidFareSum;
			System.out.println("아빠는 성인이 아닙니다. \n부모님의 여행비용 합은 "+totalFare+"입니다.");
		} else if(mother < 19 && father >= 19) {
			// 아빠 또는 엄마가 성인이 아니고 아빠 엄마가 19미만인 경우
			adultFareSum += adultOneWayFlightFare;
			kidFareSum += kidOneWayFlightFare;
			totalFare = adultFareSum + kidFareSum;
			System.out.println("엄마는 성인이 아닙니다. \n부모님의 여행비용 합은 "+totalFare+"입니다");
		} 
		
		if(daughter >= 19) {
			totalFare += adultOneWayFlightFare;
			System.out.println("딸은 성인입니다. \n총 여행비용은 "+totalFare+"입니다");
		} else {
			totalFare += kidOneWayFlightFare;
			System.out.println("딸은 성인이 아닙니다. \n총 여행비용은 "+totalFare+"입니다");
		}
		
		if(totalFare >= money) {
			System.out.println("다음에 가자..");
		} else {
			System.out.println("여행 가자!");
		}
		
//		boolean canTravel = money - ();
//		System.out.println(canTravel);
		
	}
	
}
