package problem0123;

/**
 * 문제30)
 * Product, Seller, Buyer 클래스 설계
 */
public class Problem30 {

	public static void main(String[] args) {
		
		// 상품 정보 기입한 인스턴스 생성 (id, name, price, stock)
		Product product1 = new Product("Item001", "코코넛향 캣비누", 8000, 5);
		// 판매자 정보 기입한 인스턴스 생성 (id, name, money, product)
		Seller seller1 = new Seller("Seller001", "코코공방", 100_000, product1);
		// 구매자 정보 기입한 인스턴스 생성 (id, name, money)
		Buyer buyer1 = new Buyer("Buyer001", "강휘원", 50000);
		
		// 초기 정보 출력
//		buyer1.printBuyerInfo();
//		seller1.printSellerInfo();
		
		// 1. 상품 구매하기 (성공)... 구매량<재고량 + 금액 충분
//		buyer1.buyProduct(seller1, 3);
//		buyer1.printBuyerInfo();
//		seller1.printSellerInfo();
		
		// 2. 상품 구매하기 (실패)... 금액 불충분
//		buyer1.buyProduct(seller1, 100);
//		buyer1.printBuyerInfo();
//		seller1.printSellerInfo();
		
		// 3. 상품 구매하기 (성공 - 떨이)... 구매량>재고량 + 금액 충분
		buyer1.buyProduct(seller1, 6);
		buyer1.printBuyerInfo();
		seller1.printSellerInfo();
	}
	
}
