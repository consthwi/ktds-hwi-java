package problem0123;

import java.util.Scanner;

/**
 * 문제20)
 *  Scanner 이용.
	정수형 변수 enemyHealthPoint 를 만들고 Scanner의 nextInt() 함수를 이용해 값을 할당한다.
	무한히 반복을 하면서 난수를 생성해 enemyHealthPoint의 값을 감소 시킨다.
	만약 enemyHealthPoint의 값이 0이 되거나 음수가 되면 "Victory!" 를 출력하며 반복문을 종료한다.
 */
public class Problem20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 적의 HP 설정
		System.out.println("적의 최대 HP를 설정하세요. (정수 입력)");
		int enemyHealthPoint = scanner.nextInt();
		System.out.println("현재 적의 HP: "+enemyHealthPoint);
		
		// 회심률 설정
		double criticalChance;
		// 크리티컬 횟수 설정
		int criticalCount = 0;
		// 전투 회차 카운터 변수
		int count = 1;
		
		while(true) {
			System.out.println("===============================");
			System.out.println("*"+count+"회차 전투가 시작되었습니다.");
			
			// 회차 마다 회심률 업데이트
			criticalChance = Math.random()*100;
			
			// 500~1000 데미지
			int myDamage = (int)(Math.random()*501+500);
			
			// 치명적인 공격에 성공할 경우 2배 데미지 (20% 확률)
			if(criticalChance>80) {
				enemyHealthPoint -= myDamage*2;
				criticalCount++;
				
				// 적의 HP가 0 또는 음수일 경우 0으로 출력
				if(enemyHealthPoint <= 0) {
					enemyHealthPoint = 0;
				}
				
				System.out.println("치명적인 공격에 성공하였습니다!");
				System.out.println(myDamage*2+"의 데미지를 주었습니다.");
				System.out.println("현재 적의 HP: "+enemyHealthPoint);				
			}
			// 그렇지 않을 경우 1배 데미지
			else {
				enemyHealthPoint -= myDamage;
				
				// 적의 HP가 0 또는 음수일 경우 0으로 출력
				if(enemyHealthPoint <= 0) {
					enemyHealthPoint = 0;
				}
				
				System.out.println("공격에 성공하여 "+myDamage+"의 데미지를 주었습니다.");
				System.out.println("현재 적의 HP: "+enemyHealthPoint);
			}
			
			// 나의 공격이 가해진 이후, 
			// 적의 HP가 0또는 음수가 될 경우 게임 종료
			if(enemyHealthPoint <= 0) {
				System.out.println();
				System.out.println("Victory!");
				System.out.println(count+"회의 공격으로 적을 처치했습니다.");
				System.out.println("총 "+criticalCount+"회의 치명적인 공격을 가했습니다.");
				break;
			}
			// 적의 HP가 양수일 경우 회차를 증가하고 루프 재진입
			else {
				count++;
			}
			
		}
		
	}
	
}
