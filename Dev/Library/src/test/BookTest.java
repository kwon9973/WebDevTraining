package test;

import java.time.LocalDate;

import exception.BookAlreadyBorrowedException;
import model.Book;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("B001", "안녕하세요, 이권형입니다","이권형","프로그래밍",LocalDate.of(2025, 8, 1));
		
		System.out.println(book);
		System.out.println(book.isAvailable());
		
		try {
			//연체 기능 테스트 / 같은책 연체 불가능
			book.borrowTo("M001");
			System.out.println("대출 상태: " + (book.isAvailable() ? "대출가능" : "대출불가능"));
			book.borrowTo("M002");
		}catch(BookAlreadyBorrowedException e){
			System.out.println(e.getLocalizedMessage());
		}
		
		//반납
		book.returnBook();
		System.out.println((book.isAvailable() ? "대출가능" : "대출불가능"));
	}
}
