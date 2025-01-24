package com.ktdsuniversity.edu.comicbookcafe;

public class ComicBookCafe {
	
	private final int rentalCost = 500;
	private int money = 100_000;
	private int count = 0;
	
	private ComicBook item1;
	private ComicBook item2;
	private ComicBook item3;
	private ComicBook item4;
	
	public ComicBookCafe(int money, ComicBook item1, ComicBook item2, ComicBook item3, ComicBook item4) {
		this.money = money;
		
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	// 만화책을 대여한다.
	// - 만화책을 대여하면 상태가 대여중으로 변경되며,
	// - 대여비용만큼 소지금액이 증가한다.
	public void rentalBooks(String rentalBookTitle) {
		System.out.println();
		System.out.println("※만화책 대여 프로그램이 실행됩니다.");
		if(rentalBookTitle == this.item1.getTitle()) {
			// getIsRental()이 true이면 대여 중인 상태이다.
			// => 대여할 수 없다.
			if(!this.item1.getIsRental()) {
				// 1. 대여중 상태를 true로 변경한다.
				this.item1.setToggleIsRental();
				// 2. 소지자본을 변경한다.
				this.money += this.rentalCost;
				System.out.println(this.item1.getTitle()+"을(를) 대여를 완료했습니다.");
			} 
			else {
				System.out.println("요청한 "+this.item1.getTitle()+"은(는) 현재 대여 중입니다.");
			}
		}
		else if(rentalBookTitle == this.item2.getTitle()) {
			
			if(!this.item2.getIsRental()) {
				this.item2.setToggleIsRental();
				this.money += this.rentalCost;
				System.out.println(this.item2.getTitle()+"을(를) 대여를 완료했습니다.");
			} 
			else {
				System.out.println("요청한 "+this.item2.getTitle()+"은(는) 현재 대여 중입니다.");
			}
		}
		else if(rentalBookTitle == this.item3.getTitle()) {
			
			if(!this.item3.getIsRental()) {
				this.item3.setToggleIsRental();
				this.money += this.rentalCost;
				System.out.println(this.item3.getTitle()+"을(를) 대여를 완료했습니다.");
			} 
			else {
				System.out.println("요청한 "+this.item3.getTitle()+"은(는) 현재 대여 중입니다.");
			}
		}
		else if(rentalBookTitle == this.item4.getTitle()) {
			
			if(!this.item4.getIsRental()) {
				this.item2.setToggleIsRental();
				this.money += this.rentalCost;
				System.out.println(this.item4.getTitle()+"을(를) 대여를 완료했습니다.");
			} 
			else {
				System.out.println("요청한 "+this.item2.getTitle()+"은(는) 현재 대여 중입니다.");
			}
		}
		else {
			System.out.println("기입한 상품명에 해당하는 만화책이 존재하지 않습니다.");
		}
		
	}
	
	public void returnBooks(String returnBookTitle) {
		System.out.println();
		System.out.println("※만화책 반납 프로그램이 실행됩니다.");
		if(returnBookTitle == this.item1.getTitle()) {
			if(this.item1.getIsRental()) {
				// 현재 대여 중인 책을 반납했을 경우
				// 1. 대여 상태를 true로 변경한다(토글).
				this.item1.setToggleIsRental();
				// 2. 반납 성공 메시지를 출력한다.
				System.out.println(this.item1.getTitle()+"의 반납이 완료되었습니다.");
			} 
			else {
				// 현재 대여중이지 않은 책을 반납했을 경우
				System.out.println(this.item1.getTitle()+"은(는) 현재 대여 중 상태가 아닙니다.");
			}
		}
		else if(returnBookTitle == this.item2.getTitle()) {
			if(this.item2.getIsRental()) {
				this.item2.setToggleIsRental();
				System.out.println(this.item2.getTitle()+"의 반납이 완료되었습니다.");
			} 
			else {
				System.out.println(this.item2.getTitle()+"은(는) 현재 대여 중 상태가 아닙니다.");
			}
		}
		else if(returnBookTitle == this.item3.getTitle()) {
			if(this.item3.getIsRental()) {
				this.item3.setToggleIsRental();
				System.out.println(this.item3.getTitle()+"의 반납이 완료되었습니다.");
			} 
			else {
				System.out.println(this.item3.getTitle()+"은(는) 현재 대여 중 상태가 아닙니다.");
			}
		}
		else if(returnBookTitle == this.item4.getTitle()) {
			if(this.item4.getIsRental()) {
				this.item4.setToggleIsRental();
				System.out.println(this.item4.getTitle()+"의 반납이 완료되었습니다.");
			} 
			else {
				System.out.println(this.item4.getTitle()+"은(는) 현재 대여 중 상태가 아닙니다.");
			}
		}
		else {
			System.out.println("기입한 상품명에 해당하는 만화책이 존재하지 않습니다.");
		}
	}
	
	public void printAllBooks() {
		System.out.println();
		System.out.println("==== "+(++count)+"회차 만화책 대여 현황 ====");
		System.out.println(this.item1.getTitle()+": "+this.item1.getIsRental());
		System.out.println(this.item2.getTitle()+": "+this.item2.getIsRental());
		System.out.println(this.item3.getTitle()+": "+this.item3.getIsRental());
		System.out.println(this.item4.getTitle()+": "+this.item4.getIsRental());		
	}
	
	
}
