package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* OX 퀴즈*/
public class Exam06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] quizResult = new String[num];
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int sum = 0;
		
		// OX 입력을 위한 식
		for (int i=0; i<quizResult.length; i++) {
			quizResult[i] = br.readLine();
		}
		
		// 입력한 OX를 쪼갠 후 점수 계산을 위한 식
		for (int i=0; i<quizResult.length; i++) {
			for (int j=0; j<quizResult[i].length(); j++) {
				if (quizResult[i].charAt(j) == 'O') {
					count += 1;
					sum += count;
				} else {
					count = 0;
				}
			}
			sb.append(sum).append("\n");
			// 값 초기화
			count = 0;
			sum = 0;
		}
		
		System.out.println(sb);
	}
}
