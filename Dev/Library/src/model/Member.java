package model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

import exception.LibraryException;

public class Member extends Person {
	
	private LocalDate joinDate; //가입일
	private ArrayList<String> borrowedBooks; //대출한 책 isbn 리스트
	private static final int MAX_BORROW = 3;
	
	public Member(String id, String name, String phone) {
		super(id, name, phone);
		this.joinDate = joinDate.now();
		this.borrowedBooks = new ArrayList<String>();
	}
	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return "회원";
	}
	//대출 가능 여부
	public boolean canBorrow() {
		return MAX_BORROW > borrowedBooks.size();
	}
	//책반납
	public boolean returnBook(String isbn) {
		return borrowedBooks.remove(isbn);
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	//방어적 복사 - member가 access할수 있기때문 - array 복사본 만든후 사용하는 방식으로
	public ArrayList<String> getBorrowedBooks() {
		ArrayList<String> copy = new ArrayList<String>(borrowedBooks);
		return copy; 
	}
	//현재 대출한 책개수
	public int getBorrowedCount() {
		return(borrowedBooks.size());
	}
	//대출 불가시
	public void borrowBook (String isbn) throws LibraryException{
		//최대 대출 권수 확인
		if(!canBorrow()) {
			throw new LibraryException("최대 대출 권수" + MAX_BORROW + "초과");
		}else if(borrowedBooks.contains(isbn)) {
			throw new LibraryException("이미 대출받은 책입니다");
		}
		borrowedBooks.add(isbn);
	}
	//회원정보 문자열로
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return super.toString() + String.format(" | 가입일: %s, 대출중: %d권", joinDate.format(formatter), borrowedBooks.size());
	}
	
	
	
	
	
	
	
}
