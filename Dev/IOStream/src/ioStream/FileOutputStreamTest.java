package ioStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) { // TRUE 를 통해 append 된다
			byte[] by = new byte[500];
			byte data = 65;
			
		
			for(int i = 0; i < by.length; i++) { //why by.length?? why not the sentence length itself?
				// assign to array 
			}
			
			
			
 		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
