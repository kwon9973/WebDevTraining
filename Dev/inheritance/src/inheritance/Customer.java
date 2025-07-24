package inheritance;

public class Customer {
	protected int customerID;
	protected String name;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	Customer(){
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showInfo() {
		return name + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint +"입니다.";
	}
}
