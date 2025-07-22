package loop;
import java.util.*;

public class Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		
		do {
			System.out.print("문자열을 입력하세요(exit: 종료)");
			choice = input.nextLine();
			
			if(choice.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.println("입력한 문자열: " + choice);
		}while(true);
	}
}
