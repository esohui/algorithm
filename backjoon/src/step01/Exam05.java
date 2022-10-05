package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 세 수가 주어졌을 때, 네 가지 값을 구하는 프로그램 */
public class Exam05 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        // 두 값이 같음
        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        // 두 값이 같음
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
