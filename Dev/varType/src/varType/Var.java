package varType;

import java.util.*;


public class Var {
	public static void main(String[] args) {

		byte b = 127; // -128 ~ 127 까지만    
		int bitCount = 8;
		System.out.println("byte의 표현가능한 값의 개수 : " + (int)(Math.pow(2, bitCount)));
		int minValue = -(int)Math.pow(2, bitCount-1);
		System.out.println("최소값: "+minValue);
		int maxValue = (int)Math.pow(2, bitCount-1)-1;
		System.out.println("최대값: "+maxValue);
		
		
		System.out.println();
		short s = 32767; // -32768 ~ 32767
		int bitCount2 = 16;
		System.out.println("short의 표현가능한 값의 개수 : " + (int)(Math.pow(2, bitCount2)));
		int minValue2 = -(int)Math.pow(2, bitCount2-1);
		System.out.println("최소값: " + minValue2);
		
		
		System.out.println();
		int i = 0;
		int bitCount3 = 32;
		System.out.println("int&float의 표현가능한 값의 개수 : " + (long)Math.pow(2, bitCount3));
		int minValue3 = -(int)Math.pow(2, (bitCount3-1));
		System.out.println("최소값: " + minValue3);
		
		
		System.out.println();
		long l = 0;
		int bitCount4 = 64;
		//
		System.out.println("long&double의 표현가능한 값의 개수 : " + ((long)Math.pow(2, bitCount4) + (long)Math.pow(2, bitCount4)) + " <- 표현이 안되니 진짜 최대값은: " + Double.MAX_VALUE ); 
		long minValue4 = -(long)Math.pow(2, (bitCount4-1));
		System.out.println("최소값: " + minValue4);
		long maxValue4 = (long)Math.pow(2, (bitCount4-1))-1;
		System.out.println("최대값: " + maxValue4);
				
				
		
		
		
		
		
		
	}

}
