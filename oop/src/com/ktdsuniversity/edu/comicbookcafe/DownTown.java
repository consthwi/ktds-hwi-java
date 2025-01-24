package com.ktdsuniversity.edu.comicbookcafe;

public class DownTown {
	
	public static void main(String[] args) {
		
		ComicBook slamdunk1 = new ComicBook("슬램덩크1", false);
		ComicBook slamdunk2 = new ComicBook("슬램덩크2", false);
		ComicBook slamdunk3 = new ComicBook("슬램덩크3", false);
		ComicBook slamdunk4 = new ComicBook("슬램덩크4", false);
		
		ComicBookCafe dcComics = new ComicBookCafe(10000, slamdunk1, slamdunk2, slamdunk3, slamdunk4);
		
		dcComics.printAllBooks();
		System.out.println("현재 보유한 자본은 "+dcComics.getMoney()+"원 입니다.");
		
		dcComics.rentalBooks("슬램덩크1");
		dcComics.printAllBooks();
		System.out.println("현재 보유한 자본은 "+dcComics.getMoney()+"원 입니다.");
	
		dcComics.rentalBooks("슬램덩크2");
		dcComics.printAllBooks();
		System.out.println("현재 보유한 자본은 "+dcComics.getMoney()+"원 입니다.");
		
		dcComics.returnBooks("슬램덩크2");
		dcComics.returnBooks("슬램덩크3");
		dcComics.printAllBooks();
		
		
		
	}
	
}
