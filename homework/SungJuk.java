package homework;

import java.util.Scanner;

public class SungJuk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		
		System.out.print("인원수 입력: ");
		count = sc.nextInt();
		
		String[] name = new String[count];
		int subjectCount;
		
		String[][] subject = new String[count][];
		int[][] score = new int[count][];
		double[] avg = new double[count];
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름 입력: ");
			name[i] = sc.next();
			
			System.out.print("과목수 입력: ");
			subjectCount = sc.nextInt();
			
			subject[i] = new String[subjectCount];
			for(int j=0; j<subjectCount; j++) {
				System.out.print("과목명 입력: ");
				subject[i][j] = sc.next();
			}
			
			score[i] = new int[subjectCount+1];
			for(int j=0; j<subjectCount; j++) {
				System.out.print(subject[i][j] + "점수 입력: ");
				score[i][j] = sc.nextInt();
				
				score[i][subjectCount] += score[i][j];
			}
			
			avg[i] = (double)score[i][subjectCount] / subjectCount;
		}
		
		System.out.println();
		for(int i=0; i<count; i++) {
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t");
			}
			System.out.println("총점\t평균");
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(String.format("%.2f", avg[i]));
			System.out.println();
		}
    }
}


/*
 인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어	  영어   총점     평균
홍길동    95	  100   xxx	  xx.xx

이름		국어  영어   과학    총점      평균
이기자	95   100   90	 xxx      xx.xx
 */

