package problem0123;

/**
 * 문제30)
 * 클래스를 설계하고 작성
 * 구매자
 * 	필드
 *   보유 금액
 *   장바구니
 *    + 구매자id
 *    + 구매자 이름
 *   
 *  메서드
 *   getter
 *   구매(수량)
 *    + 구매자 현황
 */
public class Buyer {

	// 멤버 변수
	private String buyerId;
	private String buyerName;
	private double buyerMoney;
	private int cart;
	
	// 생성자
	public Buyer(String buyerId, String buyerName, double buyerMoney) {
		this.buyerId = buyerId;
		this.buyerName = buyerName;
		this.buyerMoney = buyerMoney;
		this.cart = 0;
	}
	
	// 메서드
	// getter
	public String getBuyerId() {
		return this.buyerId;
	}
	
	public String getBuyerName() {
		return this.buyerName;
	}
	
	public double getBuyerMoney() {
		return this.buyerMoney;
	}
	
	public int getCart() {
		return this.cart;
	}
	
	/**
	 * 최종 구매 수량을 반환하는 메서드
	 * @param quantity Buyer클래스에서 파라미터로 받아온 구매량
	 * @param stock Seller클래스의 멤버변수 stock(재고량)
	 * @return 구매량>재고량 ? 재고량 : 구매량
	 */
	public int getFinalQuantity(int quantity, int stock) {
		// 1. 구매량이 재고량보다 크면 재고량 반환 (떨이)
		if(quantity > stock) {
			return stock;
		}
		// 2. 그렇지 않으면 구매량 반환
		return quantity;
	}
	
	// 구매하기(수량)
	// 1. 상품가격*구매량 만큼 buyerMoney 감소
	//	1) if (구매량 > 재고량) => 떨이
	//  2) buyerMoney가 충분하지 않으면 아무일 없음.
	// 2. 구매량만큼 장바구니 수량 증가
	public void buyProduct(Seller seller, int quantity) {

		// 구매자 상품정보 get
		Product product = seller.getProduct();
		// 구매 가능 여부 확인하기 위한 총 지불금액
		double totalCost = product.getPrice()*quantity;
		
		// 1. buyerMoney가 부족하면 구매실패
		if(this.buyerMoney < totalCost) {
			System.out.println("구매자의 보유금액이 부족하여 거래가 실패했습니다.");
		}
		// 2. 그렇지 않으면 구매성공
		else {
			// 구매 가능한 경우, 최종 구매 수량 get
			int finalQuantity = this.getFinalQuantity(quantity, product.getStock());
			// 최종 지불 금액
			double finalCost = product.getPrice()*finalQuantity;
			
			// 2-1. 총 지불금액만큼 buyMoney 감소
			this.buyerMoney -= finalCost;
			// 2-2. 장바구니 수량 증가
			this.cart += finalQuantity;
			// 2-3. stock 감소 - 판매 메서드 실행
			seller.sellProduct(finalQuantity);
			
			System.out.println("상품명("+product.getName()+") "+finalQuantity+"개를 성공적으로 구매했습니다.");
		}

	}
	
	// 구매자 정보 출력
	public void printBuyerInfo() {
		System.out.println("====구매자 정보====");
//		System.out.println("구매자 ID: "+this.getBuyerId());
//		System.out.println("구매자 이름: "+this.getBuyerName());
		System.out.println("구매자 보유금액: "+this.getBuyerMoney());
		System.out.println("구매자 장바구니 상품 수량: "+this.getCart());
		System.out.println();
	}
	
}
