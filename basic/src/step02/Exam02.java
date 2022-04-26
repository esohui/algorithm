package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 시험 성적 */
public class Exam02 {
	public static void main(String[] arags) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		int num = input / 10;

		switch (num) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
