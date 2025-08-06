package exception;

public class Exception {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for (int i = 0; i <= arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		System.out.println("정상 출력");
	}
}
    