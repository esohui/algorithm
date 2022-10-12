package level_0;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Day 6 문자열, 반복문, 출력, 배열, 조건문
 * - 문자열 뒤집기
 * - 직각삼각형 출력하기
 * - 짝수 홀수 개수
 * - 문자 반복 출력하기
 */
public class Exam_8 {
	public static void main(String[] args) {
		Exam_8 exam = new Exam_8();
		
		System.out.println(exam.reverse("abcde"));
//		exam.triangle(3);
		int[] num_list = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(exam.evenOddNumber(num_list)));
		System.out.println(exam.repeat("hello", 3));
	}
	
	// (1) 문자열 뒤집기
	public String reverse(String my_string) {
		StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }
	
	// (2) 직각삼각형 출력하기
	public void triangle(int num) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j <= i; j++) {
        		System.out.print('*');        		
        	}
        	System.out.println();
        }
    }
	
	// (3) 짝수 홀수 개수
	public int[] evenOddNumber(int[] num_list) {
		int evenCnt = 0;
		int oddCnt = 0;
		for (int num : num_list) {
			if (num % 2 == 0) {
				evenCnt++;
			} else {
				oddCnt++;
			}
		}
        int[] answer = {evenCnt, oddCnt};
        return answer;
    }
	
	// (4) 문자 반복 출력하기
	public String repeat(String my_string, int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				sb.append(my_string.charAt(i));
			}
		}
        String answer = sb.toString();
        return answer;
    }
	
}
