package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 첫 줄은 케이스의 개수. 두 정수를 입력받은 뒤 더한 값을 출력 */
public class Exam02 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String num2;

		for (int i = 0; i < num; i++) {
			num2 = br.readLine();
			StringTokenizer st = new StringTokenizer(num2, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a + b);
		}
	}
}
