package com.ktdsuniversity.edu.fruitseller;

public class Mart {

	public static void main(String[] args) {
		
		FruitSeller coupang = new FruitSeller(100, 1000);
		
		coupang.sell(2);
		coupang.sell(10);

		// 현황 출력;
		System.out.println("판매결과 현재 보유금액: "+coupang.getMoney()+"원 입니다.");
		System.out.println("판매결과 현재 상품보유량: "+coupang.getFruitStock()+"개 입니다.");
	}
	
}
