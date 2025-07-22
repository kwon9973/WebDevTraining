package array;


import java.util.*;


public class Array {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int studentCount = 0;
		
		System.out.println(" [문제]  성적 처리 시스템");
		System.out.print("3개 과목을입력합니다. 학생수를 입력하세요: ");
		studentCount = input.nextInt();		
		System.out.println();
		
		float[] average = new float[studentCount]; 
		float[][] student = new float[studentCount][3];
		
		for(int i = 0; i < studentCount; i++) {
			for (int j = 0; j < 3; j++) {
				if(j == 0) {
					System.out.print((i+1) + "번쨰 학생 국어 점수: ");
					student[i][j] = input.nextFloat();
				}else if(j == 1) {
					System.out.print((i+1) + "번쨰 학생 영어 점수: ");
					student[i][j] = input.nextFloat();
				}else {
					System.out.print((i+1) + "번쨰 학생 수학 점수: ");
					student[i][j] = input.nextFloat();
				}
				average[i] += student[i][j];
			}
		}
		
		//System.out.printf("%-2s %-3s %-3s %-3s %-3s\n","학생", "수학", "영어", "과학", "평균");
		
		/*
		for(int i = 0; i < 5; i++) {
			float average = 0;
			System.out.print((i+1) + "번 ");
			for (int j = 0; j < 3; j++) {
				System.out.print(student[i][j] + " ");
				average += student[i][j];
			}
			System.out.printf("%.1f\n", average / 3);
		}
		*/
		
		
		/*
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0) {
					mathAverage += student[j][i];
				}else if(i == 1) {
					englishAverage += student[j][i];
				}else {
					scienceAverage += student[j][i];
				}
			}
		}
		*/
		
		
		
		System.out.println();
		System.out.println("학생별 총점 & 평균: ");
		int index = 0;
		do {
			System.out.printf("%d번째 학생 총점: %.1f 평균: %.1f\n",index+1, average[index], average[index]/3);
			index++;
		}while(index < studentCount);
	
	
	
	
	}
}
