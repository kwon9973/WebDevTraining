package model;

import java.time.*;
import java.time.format.DateTimeFormatter;

import exception.BookAlreadyBorrowedException;


public class Book {
	private String isbn;
	private String title;
	private String author;
	private String category;
	private LocalDate publishDate;
	private boolean available;
	private String borrowedId;
	private LocalDate borrowedDate;
	
	public Book(String isbn, String title, String author, String category, LocalDate publishDate) {
		//super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.category = category;
		this.publishDate = publishDate;
		this.available = true;
		this.borrowedId = null;
		this.borrowedDate = null;
	}
	//책 대출 처리
	public void borrowTo(String memberId) throws BookAlreadyBorrowedException {
		if(available != true) {
			throw new BookAlreadyBorrowedException("not available");
		}else {
			this.available =false;
			this.borrowedId = memberId;
			this.borrowedDate = LocalDate.now();
		}
	}
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public boolean isAvailable() {
		return available;
	}
	public String getBorrowedId() {
		return borrowedId;
	}
	public LocalDate getBorrowedDate() {
		return borrowedDate;
	}
	//책 반납 처리
	public void returnBook(){
		this.available = true;
		this.borrowedDate = null;
		this.borrowedId = null;
	}
	//연체 여부 확인 (14일 기준)
	//연체면 true 아님 false
	public boolean isOverdue() {
		if(this.borrowedDate == null) {return false;}
		return LocalDate.now().isAfter(borrowedDate.plusDays(14));
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String status = this.available ? "대출가능" : ("대출중 - " + this.borrowedId +" | 대출날짜: "+ this.borrowedDate.format(formatter) + 
				" | 연체여부: " + (isOverdue() ? "연체됨" + this.borrowedDate.plusDays(14) : "연체아님" ));
		
		return String.format("\nISBN: %s | 제목: %s | 저자: %s | 키테고리: %s | 출판일: %s | 상태: %s", 
				isbn, title, author, category, publishDate, available ? "availalbe":"unavailable"); 
	}
}
