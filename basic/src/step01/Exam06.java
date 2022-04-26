package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* (세 자리 수) × (세 자리 수) 곱하는 과정 */
public class Exam06 {
	public static void main(String[] args) throws IOException {
		
		// Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// int a = Integer.parseInt(scanner.nextLine());
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
        
		int c = Integer.parseInt(b.substring(2));
		int d = Integer.parseInt(b.substring(1,2));
		int e = Integer.parseInt(b.substring(0,1));
        
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println((a*c)+(a*d*10)+(a*e*100));
    }
}
