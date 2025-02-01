package problem0123;

/**
 * 문제22)
 *  1 부터 50 중 30~39 까지의 숫자만 출력한다.
 */
public class Problem22 {

	public static void main(String[] args) {
		
		for(int i=1; i<51; i++) {
			if(i>=30 && i<=39) {
				System.out.println(i);
			}
		}
		
	}
	
}
