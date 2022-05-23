package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 나머지 */
public class Exam04 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] input = new int[10];
		int[] dup = new int[10];
		int count = 1;

		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(br.readLine());
			dup[i] = input[i] % 42;
		}
		Arrays.sort(dup);
		for (int i = 0; i < dup.length; i++) {
			if (i > 0) {
				if (dup[i - 1] != dup[i]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		boolean[] input = new boolean[42];
//		for (int i = 0; i < 10; i++) {
//			input[Integer.parseInt(br.readLine())%42] = true;
//		}
//		int count = 0;
//		for (boolean val : input) {
//			if (val == true) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
}
