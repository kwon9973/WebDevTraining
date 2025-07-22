package constructor;

public class Constructor {
	String title;
	String author;
	int page;
	
	Constructor(){
		this.title = "";
		this.author = "";
		this.page = 0;
	}
	Constructor(String title){
		this.title = title;
		this.author = "";
		this.page = 0;
	}
	Constructor(String title, String author){
		this.title = title;
		this.author = author;
		this.page = 0;
	}
	Constructor(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public String toString() {
		return "제목: " + this.title + " | 저자: " + this.author + " | 페이지수: " + this.page;
	}
	
}
