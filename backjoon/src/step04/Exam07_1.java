package step04;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 평균은 넘겠지 */
public class Exam07_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int c = Integer.parseInt(br.readLine());
		
		String[] testCase = new String[c];
		for (int i=0; i<testCase.length; i++) {
			testCase[i] = br.readLine();
		}
		
		String[] grade;
		
		for (int i=0; i<testCase.length; i++) {
			
			int total = 0;
			double gradeAvg = 0.0;
			int sum = 0; // 평균보다 높은 사람 수
			
			grade = testCase[i].split(" ");
			for (int j=1; j<grade.length; j++) {
				total += Integer.parseInt(grade[j]);
			}
			
			gradeAvg = total / Integer.parseInt(grade[0]);
			for (int j=1; j<grade.length; j++) {
				if (Integer.parseInt(grade[j]) > gradeAvg) {
					sum++;
				}
			}
			
			System.out.println(String.format("%.3f", sum / Double.parseDouble(grade[0]) * 100) + "%");
		}
	}
}
