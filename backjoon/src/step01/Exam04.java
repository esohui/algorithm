package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 불기 연도를 서기 연도로 변경 */
public class Exam04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		System.out.println(a - 543);
    }
}
