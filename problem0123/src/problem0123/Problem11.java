package problem0123;

/**
 * 
 */
public class Problem11 {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*10);
		
		double result = (double)num1/num2;
		System.out.println("num1: "+num1+", num2: "+num2);
		System.out.println("num1를 num2로 나눈 몫은 "+result+"입니다.");
		
	}
	
}
