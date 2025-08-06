package ioStream;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("reader.txt")){
			int i;
			byte[] b = new byte[5];
			
			//while((i = fr.read(b)) != -1) {
				
			//}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
