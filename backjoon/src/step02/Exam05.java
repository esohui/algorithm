package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 알람 시계 */
public class Exam05 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a = m - 45;

		if (a < 0) {
			if (h == 0) {
				h = 23;
			} else {
				h -= 1;
			}
			m += 15;
		} else {
			m = a;
		}
		System.out.println(h + " " + m);
    }
}
