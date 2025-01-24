package first_java_program;

public class MethodProblem {
	
	public static int ArtithmaticProblem1(int inputMin, int inputSec) {		
		int processTime = (inputMin*60) + inputSec;
		return processTime;
	}
	
	public static void ArtithmaticProblem2(int inputProcessTime) {		
		int minutes = (int)(inputProcessTime/60);
		int seconds = (int)(inputProcessTime%60);
		System.out.println(inputProcessTime+"초는 "+minutes+"분 "+seconds+"초 입니다.");
	}
	
	public static double ArtithmaticProblem3(double inputCelsius) {		
		double fahrenheit = (inputCelsius * 9/5)+32;
		return fahrenheit;
	}
	
	public static int ArtithmaticProblem4_1(int inputKorScore, int inputEngScore, int inputMathScore, int inputProgScore) {
		int sum = inputKorScore+inputEngScore+inputMathScore+inputProgScore;
		return sum;
	}
	
	public static double ArtithmaticProblem4_2(double inputSum, int inputLength) {
		double average = inputSum/inputLength;
		return average;
	}
	
	public static String ArtithmaticProblem4_3(int inputAverage) {
		String grade = "";
		if(inputAverage >= 95) {
			grade = "A+";
		} 
		else if(inputAverage >= 90) {
			grade = "A";
		} 
		else if(inputAverage >= 85) {
			grade = "B+";
		}
		else if(inputAverage >= 80) {
			grade = "B";
		}
		else if(inputAverage >= 70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		return grade;
	}
	
	public static int ArtithmaticProblem5(int inputFatherAge, int inputMotherAge, int inputDaughterAge) {
		int totalCost = 0;
		int adultFare = 300_000;
		int kidFare = 120_000;
		
		if(inputFatherAge>19) {
			totalCost += adultFare;
		}
		else {
			totalCost += kidFare;
		}
		
		if(inputMotherAge>19) {
			totalCost += adultFare;
		}
		else {
			totalCost += kidFare;
		}
		
		if(inputDaughterAge>19) {
			totalCost += adultFare;
		}
		else {
			totalCost += kidFare;
		}
		
		return totalCost;
	}
	
	public static void main(String[] args) {
		// 연습문제1
		int result1 = ArtithmaticProblem1(10, 35);
		System.out.println("진행된 시간은 총 "+result1+"초입니다.");
		
		// 연습문제2
		ArtithmaticProblem2(6528);
		
		// 연습문제3
		double result3 = ArtithmaticProblem3(32);
		System.out.println("기입한 섭씨온도를 화씨온도로 변환하면 "+result3+"F입니다.");
		
		// 연습문제4-1
		int result4_1 = ArtithmaticProblem4_1(50, 60, 70, 80);
		System.out.println("기입한 네 과목점수의 총 합은 "+result4_1+"점입니다.");
		// 연습문제4-2
		double result4_2 = ArtithmaticProblem4_2(301, 4);
		System.out.println("기입한 과목의 평균점수는 "+result4_2+"점입니다.");
		// 연습문제4-3
		String result4_3 = ArtithmaticProblem4_3(94);
		System.out.println("기입한 평균점수의 등급은 "+result4_3+"입니다.");
		
		// 연습문제5
		int result5 = ArtithmaticProblem5(60, 55, 11);
		System.out.println("총 가족여행 비용은 "+ArtithmaticProblem5(60, 55, 11)+"원 입니다.");
	}
	
	
}
