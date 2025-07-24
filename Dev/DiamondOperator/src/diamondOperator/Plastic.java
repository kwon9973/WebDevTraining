package diamondOperator;

public class Plastic extends Material{
	private int toughness;
	private int elasticity;
	public Plastic(int oil, int tough, int ela){
		super(oil);
		this.toughness = tough;
		this.elasticity = ela;
	}
	
	
	public int getToughness() {
		return toughness;
	}
	public void setToughness(int toughness) {
		this.toughness = toughness;
	}
	public int getElasticity() {
		return elasticity;
	}
	public void setElasticity(int elasticity) {
		this.elasticity = elasticity;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Plastic";
	}
}
