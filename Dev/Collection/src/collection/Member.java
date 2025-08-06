package collection; 

public class Member {
	private int ID;
	
	public int getID() {
		return this.ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member) obj;
			return this.ID == mem.ID;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return this.ID;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID: " + this.ID;
	}
	
}
