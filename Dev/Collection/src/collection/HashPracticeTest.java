package collection;

import java.util.*;

public class HashPracticeTest {
	private HashMap<Integer, Member> hashMap;
	
	public HashPracticeTest() {
		hashMap = new HashMap<>();
	}
	public void addMember(Member member) {
		hashMap.put(member.getID(), member);
	}
	/*
	public void removeMember(Member member) {
		if(Member.getClass() == "admin") {
			
		}
		hashMap.remove(member);
	}
	*/
	public void removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}else {
			System.out.println("존재하지 않는 key값입니다.");
		}
	}
	
}
