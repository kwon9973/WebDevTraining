package inheritance;

public class VipCustomer extends Customer {
	private int agentID;
	private double salesRatio;
	
	public VipCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	public double getSalesRatio() {
		return salesRatio;
	}
	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	@Override
	public int calcPrice(int price) {
		
		return super.calcPrice(price);
	}
}
