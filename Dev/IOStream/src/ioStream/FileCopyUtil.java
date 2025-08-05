package ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class FileCopyUtil {
	
	private static final int BUFFER_SIZE = 64 * 1024;
	
	public static void main(String[] args) {
		System.out.println("=== 파일 복사 유틸리티 ===");
		 
		String sourceFile = "Oh_my_cool.jpg";
		String targetFile = "Oh_my_cool2.jpg";
		
		//파일 복사
		boolean success = copyFileWithProcess(sourceFile, targetFile);
	}

	private static boolean copyFileWithProcess(String sourceFile, String targetFile) {
		try(FileInputStream sourceStream = new FileInputStream(sourceFile)){
			FileOutputStream targetStream = new FileOutputStream(targetFile);
			
			long fileSize = sourceStream.getChannel().size();
			
			if(fileSize == 0) {
				System.out.println("empty file");
				return true;
			}
			
			System.out.printf("파일 크기: %d 바이트 (%.2f KB) \n", fileSize, fileSize / 1024.0);
			
			byte[] buffer = new byte[BUFFER_SIZE];
			int byteRead;
			long totalCopied = 0;
			long lastProgressTime = System.currentTimeMillis();
			
			//파일 버퍼단위로 읽어서 복사
			while((byteRead = sourceStream.read(buffer)) != -1) {
				//읽은 데이터를 대상 파일에 쓰기
				targetStream.write(buffer, 0, byteRead);
				
				//복사한 바잍 누적
				totalCopied += byteRead;
				
				//진행률 계산 및 출력
				long currentTime = System.currentTimeMillis();
				if(currentTime - lastProgressTime >= 1000 || totalCopied == fileSize) {
					double progressPercent = (double)totalCopied / fileSize * 100;
					//String progressBar = createProgressBar(progressPercent);
					
					//System.out.printf("\r진행률 [%s] %.1f%% (%d / %d bytes)", progressBar, progressPercent, totalCopied, fileSize);
					
					lastProgressTime =currentTime;
				}
			}
			targetStream.flush();
			System.out.println("복사완료");
			
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
			System.err.println(sourceFile + " 파일은 존재하지 않습니다");
			return false;
		}catch(IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		return true  ;
	}
/*
	private static String createProgressBar(double percent) {
		int totalBlcoks = 30;
		int filledBlocks = (int)(percent / 100 * totalBlcoks);
		
		StringBuilder bar = new StringBuilder();                                                                                                                    n
		for(int i = 0; i <filledBlocks; i++) {
			bar.append("*");
		}
		for(int i = 0; i <filledBlocks; i++) {
			bar.append("x");
		}
				
		
		return bar.toString();
	}
	*/
}
