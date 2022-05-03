package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 숫자의 개수 */
public class Exam03 {
	public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        int mul = a * b * c;
        String str = String.valueOf(mul);
        
        String[] arr = new String[str.length()];
        int[] count = new int[10];
        
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i, i + 1);
			switch (arr[i]) {
                case "0": count[0]++; break;
                case "1": count[1]++; break;
                case "2": count[2]++; break;
                case "3": count[3]++; break;
                case "4": count[4]++; break;
                case "5": count[5]++; break;
                case "6": count[6]++; break;
                case "7": count[7]++; break;
                case "8": count[8]++; break;
                case "9": count[9]++; break;
            }
        }
        
        for (int i : count) {
        	System.out.println(i);
        }
    }
}
