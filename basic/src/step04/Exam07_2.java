package step04;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* 평균은 넘겠지 */
public class Exam07_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = Integer.parseInt(br.readLine());
		
		String[] testCase = new String[c];
		StringTokenizer st;
		
		
		for (int i=0; i<testCase.length; i++) {
			st = new StringTokenizer(br.readLine());
			
			int total = 0;
			double gradeAvg = 0;
			double sum = 0;
			
			int n = Integer.parseInt(st.nextToken());
			int[] score = new int[n];
			
			for (int j=0; j<n; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				total += score[j];
			}
			gradeAvg = total/n;
			for (int j=0; j<n; j++) {
				if (score[j] > gradeAvg) {
					sum++;
				}
			}
			bw.write(String.format("%.3f", sum/n*100)+"%\n");
		}
		bw.flush();
		bw.close();
		
	}
}
