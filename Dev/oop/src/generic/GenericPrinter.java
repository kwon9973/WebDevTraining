package generic;

public class GenericPrinter <T> {
	
	private T amount;
	
	public void setMaterial(T material) {
		this.amount = material;
	}
	public String toString() {
		return "" + this.amount;
	}
}
