package exception;

public class LibraryException extends Exception{
	
	private String message;
	
	public LibraryException(String message){
		super(message);
	}
}
