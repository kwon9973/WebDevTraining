package countOop;

public class MaxCounter {
	private int count;
	
	MaxCounter(){
		this.count = 0;
	}
	MaxCounter(int num){
		if(num > 3) {
			System.out.println("3 이상일수없습니다.");
		}else {
			this.count = num;
		}
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void increment(){
		if(this.count > 2) {
			System.out.println(this.count);
			return;
		}
		this.count++;
		System.out.println(this.count);
	}
}
