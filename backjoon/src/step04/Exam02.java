package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 최댓값 */
public class Exam02 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;
		int index = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i : arr) {
			max = Math.max(max, i);
		}
		for (int i = 0; i < arr.length; i++) {
			if (max == arr[i]) {
				break;
			}
			index++;
		}

		System.out.println(max);
		System.out.println(index);
	}
}
