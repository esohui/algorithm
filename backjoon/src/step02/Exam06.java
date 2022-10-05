package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 오븐 시계 */
public class Exam06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int o = Integer.parseInt(br.readLine());
		int mo = m + o;

		if (mo >= 60) {
			h += mo / 60;
			if (h >= 24)
				h -= 24;
			m = mo % 60;
		} else {
			m += o;
		}
		System.out.println(h + " " + m);
	}
}