package diamondOperator;
import java.util.*;

public class Printer <T extends Material>{
	Scanner input = new Scanner(System.in);
	private T material;
	private boolean isPrinting = false;
	private String objectName;
	private String choice;
	
	
	public Printer(T mat, String projectName) {
		this.material = mat;
		this.objectName = projectName;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial() {
		return this.material;
	}
	public void startPrinting() {
		if(material == null) {
			System.out.println("empty. insert material for printing");
		}else{
			System.out.println("printing ready - Material for printing: " + this.material + "is information correct? (y/n)");
			choice = input.next();
			isPrinting = true;
		}
		if(isPrinting && (choice != "n" || choice != "N")) {
			System.out.println("printing...");
		}else {
			return;
		}
	}
	public void finishPrinting() {
		System.out.println("printing finished");
		isPrinting = false;
	}
	
	
	
}

