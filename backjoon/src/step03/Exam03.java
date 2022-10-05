package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 누적 합 */
public class Exam03 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int total = 0;

		for (int i = 1; i <= num; i++) {
			total += i;
		}
		System.out.println(total);
	}
}
