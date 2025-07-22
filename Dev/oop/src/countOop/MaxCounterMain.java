package countOop;

public class MaxCounterMain{
	public static void main(String[] args) {
		int count = 0;
		MaxCounter counter = new MaxCounter(6);
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		count = counter.getCount();
		System.out.println(count);
	}
}
