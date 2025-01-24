package com.ktdsuniversity.edu.fruitseller;

public class FruitSeller {

	/**
	 * 과일 단가
	 */
	private final int FRUIT_PRICE = 500;
	
	/**
	 * 과일 판매자의 소지금 (초기 자금)
	 */
	private int money;
	
	/**
	 * 과일 판매자의 상품재고
	 */
	private int fruitStock;
	
	public FruitSeller(int money, int fruitStock) {
		this.money = money;
		this.fruitStock = fruitStock;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public int getFruitStock() {
		return this.fruitStock;
	}
	
	/**
	 * 과일을 판매한다.
	 * - 과일을 판매하면 판매량만큼 재고가 줄어야 하며,
	 * - 판매량 만큼 소지금이 증가해야 한다.
	 * @param quantity 판매량
	 */
	public void sell(int quantity) {
		if(this.fruitStock >= quantity) {
			this.fruitStock -= quantity;
			this.money += this.FRUIT_PRICE*quantity;
		}
	}
	
	
	
}
