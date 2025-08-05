package ioStream;

import java.io.*;

public class LogFileReader {
	public static void main(String[] args)  {
		System.out.println("=== 로그 파일 읽기 ===");
		String logFilePath = "server.log";
		
		
		try (FileInputStream fis = new FileInputStream(logFilePath)) {
			
			//한글처리
			byte[] buffer = new byte[8192];
			int byteRead;
			int lineNumber = 1;
			boolean isNewLine = true;
			
			System.out.println("로그 파일 내용:");
			System.out.println("------------------------------------");
			
			while((byteRead = fis.read(buffer)) != -1) {
				String content = new String(buffer, 0, byteRead, "UTF-8");
				
				for(int i =0; i < content.length(); i++) {
					char ch = content.charAt(i);
					
					
					if(isNewLine) {
						System.out.printf("%3d+ ", lineNumber);
						isNewLine = false;
						lineNumber++;
					}
					if(ch == '\n') {
						isNewLine = true;
					}
					System.out.print(ch);
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		System.out.println("sys end");
	}
}
