package lambda;

public class StringConcatImpl implements StringConcat{
	
	
	@Override
	public String makeString(String a, String b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a + "+" + b;
	}
}
