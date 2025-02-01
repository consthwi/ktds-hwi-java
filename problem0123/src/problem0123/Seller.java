package problem0123;

/**
 * 문제30)
 * 클래스를 설계하고 작성
 * 판매자
 * 	필드
 *   보유 금액
 *   판매 상품 (Seller has a Product)
 *    + 판매자id
 *    + 판매자 이름
 *   
 *  메서드
 *   getter
 *   판매(수량)
 *    + 판매자 현황
 */
public class Seller {
	
	// 멤버 변수
	private String sellerId;
	private String sellerName;
	private double sellerMoney;
	private Product product;
	
	// 생성자
	public Seller(String sellerId, String sellerName, double sellerMoney, Product product) {
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerMoney = sellerMoney;
		this.product = product;
	}
	
	// 메서드
	// getter
	public String getSellerId() {
		return this.sellerId;
	}
	
	public String getSellerName() {
		return this.sellerName;
	}
	
	public double getSellerMoney() {
		return this.sellerMoney;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	// 판매하다 (수량)
	public void sellProduct(int quantity) {
		// 1. 판매량 만큼 상품 재고량 감소
		product.reduceStock(quantity);
		
		// 2. 상품가격*판매량 만큼 sellerMoney 증가
		double benefit = product.getPrice()*quantity; // 판매수익
		this.sellerMoney += benefit;
	}
	
	// 판매자 정보 출력
	public void printSellerInfo() {
		System.out.println("====판매자 정보====");
//		System.out.println("판매자 ID: "+this.getSellerId());
//		System.out.println("판매자 이름: "+this.getSellerName());
//		System.out.println("판매자 상품명: "+this.product.getName());
//		System.out.println("판매자 상품가격: "+this.product.getPrice());
		System.out.println("판매자 상품재고량: "+this.product.getStock());
		System.out.println("판매자 보유금액: "+this.getSellerMoney());
		System.out.println();
	}
	
	
}
