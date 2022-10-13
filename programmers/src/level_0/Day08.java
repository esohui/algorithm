package level_0;

import java.util.Arrays;

/*
 * Day 8 배열, 구현, 수학
 * - 배열 자르기
 * - 외계행성의 나이
 * - 진료순서 정하기
 * - 순서쌍의 개수
 */

public class Day08 {
	public static void main(String[] args) {
		Day08 exam = new Day08();
		
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(exam.cutArray(numbers, 1, 3)));
		System.out.println(exam.age(100));
	}
	
	// (1) 배열 자르기
	public int[] cutArray(int[] numbers, int num1, int num2) {
		return Arrays.copyOfRange(numbers, num1, num2+1);
    }

	// (2) 외계행성의 나이
	public String age(int age) {
		String sAge = String.valueOf(age);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sAge.length(); i++) {
			sb.append((char)(sAge.charAt(i)+49));
			
		}
        return sb.toString();
    }

	// (3) 진료순서 정하기
	
}
