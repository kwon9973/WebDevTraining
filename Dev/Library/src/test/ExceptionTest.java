package test;

import exception.LibraryException;
import exception.BookAlreadyBorrowedException;

public class ExceptionTest{
	public static void main(String[] args) {

		try {
			throw new LibraryException("general error");
		}catch(LibraryException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new BookAlreadyBorrowedException("book is already taken");
		}catch(BookAlreadyBorrowedException e1) {
			System.out.println(e1.getMessage());
		}
	}
}
