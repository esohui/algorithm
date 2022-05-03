package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 더하기 사이클 */
public class Exam14 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		int n = input;
		int n1, n2, n4;
		int sum = 0;
		int step = 0;
		
		while (true) {
			step += 1;
			if (n == 0) {
				break;
			} else {
				if (n < 10) {
					n1 = 0;
					n2 = n;
				} else {
					String str = String.valueOf(n);
					n1 = Integer.parseInt(str.substring(0, 1));
					n2 = Integer.parseInt(str.substring(1, 2));
				}
				sum = n1+n2;
				String str2 = String.valueOf(sum);
				if (sum < 10) {
					n4 = sum;
				} else {
					n4 = Integer.parseInt(str2.substring(1, 2));
				}
				n = (n2*10) + n4;
				
				if (n == input) {
					break;
				}
			}
		}
		System.out.println(step);
	}
}
