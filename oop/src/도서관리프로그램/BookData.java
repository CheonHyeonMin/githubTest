package 도서관리프로그램;

import java.util.Scanner;

//책을 표현하는 클래스(책 정보를 가지고 있음)
public class BookData {
	private String title;
	private int price;
	private String writer;
	
	//생성자
	public BookData(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
		
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}
	
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public BookData(String title, int price, String writer) {
		this.title=title;
		this.price=priceA(price);
		this.writer=writer;
	}
	
	private int priceA(int book) {
		if(book>15000) {
			return book;
		}
		else {
			return 0;
		}
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}
	*/
	
	
}
