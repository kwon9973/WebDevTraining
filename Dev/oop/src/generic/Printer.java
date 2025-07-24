package generic;

public class Printer {
	
	public static void main(String[] args) {
		GenericPrinter<Plastic> myPrinter = new GenericPrinter<>();
		
		myPrinter.setMaterial(new Plastic());
		
		System.out.println(myPrinter);
		
	}
}
