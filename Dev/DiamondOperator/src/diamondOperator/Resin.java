package diamondOperator;

public class Resin extends Material{
	private int toughness;
	private int elasticity;
	public Resin(int solution, int tough, int ela){
		super(solution);
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
		return "resin";
	}
	
}
