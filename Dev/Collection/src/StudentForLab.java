
public class StudentForLab  {
	String name;
	double gpa;
	String major;
	int age;
	
	
	public StudentForLab(String name, int age, double gpa, String major) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "\t  "+ this.age + "  " + this.major + " \t" + this.gpa +"";
	}
}
