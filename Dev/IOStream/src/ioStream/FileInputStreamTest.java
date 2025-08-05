package ioStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("MyFile.txt")) {
			int i;
			int j;
			byte[] b = new byte[10];
			
			while((i = fis.read(b)) != -1) {
				for(j = 0; j < i; j++) {
					System.out.println((char)b[j]);
				}
				System.out.println("바이트 읽음" + i);
			}
			//fis.read();
			//fis.read();
			//fis.read();
			//fis.read();
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("sys end");
		/*
		finally {
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NullPointerException e3) {
				e3.printStackTrace();
			}
		}
		*/
	}
}
