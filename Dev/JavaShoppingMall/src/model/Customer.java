package model;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Customer extends Person{
	private LocalDateTime joinDate; // 가입일
	
	public Customer(String id, String name, String email) {
		super(id, name, email);
		this.joinDate = LocalDateTime.now();
	}
	public LocalDateTime getJoinDate() { 
		return joinDate;
	}
    @Override
	public String getUserType() {
		// TODO Auto-generated method stub
		return "고객";
	}
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return super.toString() + 
               String.format(", 가입일: %s\n", joinDate.format(formatter));
    }
}
