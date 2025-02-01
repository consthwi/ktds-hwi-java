package problem0123;

/**
 * 문제30)
 * 클래스를 설계하고 작성
 * 상품
 * 	필드
 *   상품 재고
 *   상품 가격
 *    + 상품id
 *    + 상품 이름
 *   
 *  메서드
 *   getter
 *   stock 변경
 */
public class Product {
	
	// 멤버 변수
	private String productId;
	private String name;
	private double price;
	private int stock;
	
	// 생성자
	// - 메인클래스에서 상품 생성 용도
	public Product(String productId, String name, double price, int stock) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	// 메서드
	// getter
	public String getProductId() {
		return this.productId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	// stock 변경
	public void reduceStock(int quantity) {
		this.stock -= quantity;
	}
	

	
}
