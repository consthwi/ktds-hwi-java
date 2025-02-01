package problem0123;

/**
 * 문제24)
 * 구구단 2 ~ 9 단을 출력한다.
 */
public class Problem24 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			System.out.println("====="+i+"단=====");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
		
	}
	
}
