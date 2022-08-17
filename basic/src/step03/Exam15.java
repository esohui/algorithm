package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/* 영수증 */
public class Exam15 {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		// 총금액
		int total = 0;
		
		// 영수증에 적힌 총 금액 X
		int x = Integer.parseInt(br.readLine());
		
		// 영수증에 적힌 구매한 물건의 종류의 수 N
		int n = Integer.parseInt(br.readLine());
		
		// N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
			total += a[i] * b[i];
		}
		
		if (x == total) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		bw.flush();
		
	}
}
