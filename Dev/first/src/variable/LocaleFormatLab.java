package variable;
import java.text.NumberFormat;
import java.util.*;

public class LocaleFormatLab {

	public static void main(String[] args) {
		
		double amount = 1234567.57;
		double percentage = 0.1234;
		Date date = new Date();
		
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.KOREA);
		NumberFormat numberFormat2 = NumberFormat.getNumberInstance(Locale.KOREA);
		NumberFormat numberFormat3 = NumberFormat.getNumberInstance(Locale.KOREA);
		
		System.out.println("=== 기본 숫자 포맷 결과 (천단위 구분자) ===");
		System.out.println("한국: " + numberFormat.format(amount));
		System.out.println("미국: " + numberFormat2.format(amount));
		System.out.println("미국: " + numberFormat3.format(amount));
	}
}
