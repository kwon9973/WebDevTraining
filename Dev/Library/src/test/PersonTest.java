package test;
import java.lang.Exception;
import model.Member;

public class PersonTest {
	public static void main(String[] args) {
		Member member = new Member("M001", "이순신", "010-1234-3421");
		
		System.out.println("대출가능: " + member.canBorrow());
		
		try{
			member.borrowBook("2025-1");
			member.borrowBook("2025-2");
			member.borrowBook("2025-3");
			System.out.println("현재 대출: " + member.getBorrowedCount());
			
			//member.borrowBook("2025-4");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		//반납
		boolean returned = member.returnBook("2025-1");
		System.out.println("반납안료: " + returned);
		System.out.println("현재 대출 권수: " + member.getBorrowedCount());
	}
}
