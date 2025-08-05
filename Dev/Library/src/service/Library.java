package service;

import model.Book;
import model.Librarian;
import model.Member;
import java.util.*;

import exception.LibraryException;

import java.time.*;

public class Library {
	private HashMap<String, Book> books;
	private HashMap<String, Member> members;
	private HashMap<String, Librarian> librarians;
	private String libraryName;
	
	
	public Library(String libraryName) {
		this.libraryName = libraryName;
		this.books = new HashMap<>();
		this.members = new HashMap<>();
		this.librarians = new HashMap<>();
	}
	
	//새책을 도서관에 추가
	public void addBook(String isbn, String title, String author, String category, LocalDate publishDate) throws LibraryException {
		if(books.containsKey(isbn)) {
			throw new LibraryException("이미 존재하는 isbn입니다. "+isbn);
		}
		
		Book book = new Book(isbn, title, author, category, publishDate);
		books.put(isbn, book);
		System.out.println("책이 추가됬습니다");
	}
	
	//param : title 검색할 제목(부분 검색 가능)
	//return: 검색된 제목
	public ArrayList<Book> serchBooksByTitle(String title){
		
		ArrayList<Book> results = new ArrayList<Book>();
		for(Book book : books.values()) {
			if(book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				results.add(book);
			}
		}
		return results;
	}
}
