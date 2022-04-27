package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 주사위 세개 */
public class Exam07 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if (a == b && a == c) {
			System.out.println(10000 + a * 1000);
		} else {
			if (a == b) {
				System.out.println(1000 + a * 100);
			} else if (b == c) {
				System.out.println(1000 + b * 100);
			} else if (a == c) {
				System.out.println(1000 + c * 100);
			} else {
				if (a > b && a > c) {
					System.out.println(a * 100);
				} else if (b > a && b > c) {
					System.out.println(b * 100);
				} else if (c > a && c > b) {
					System.out.println(c * 100);
				}
			}
		}
	}
}
