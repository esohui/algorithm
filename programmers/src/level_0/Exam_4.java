package level_0;

import java.util.Arrays;

/*
 * Day 3 사칙연산, 배열, 수학
 * - 나머지 구하기
 * - 중앙값 구하기
 */

public class Exam_4 {
	
	public static void main(String[] args) {
		Exam_4 exam = new Exam_4();
		
		// (1) 나머지 구하기
		System.out.println(exam.remainder(3, 2));
		
		// (2) 중앙값 구하기
		int[] array = {1, 2, 10, 7, 11};
		System.out.println(exam.median(array));
	
	}
	
	// (1) 나머지 구하기
	public int remainder(int num1, int num2) {
        return num1 % num2;
    }
	
	// (2) 중앙값 구하기(Arrays.sort 사용)
	public int median(int[] array) {
		Arrays.sort(array);
		int answer = array[array.length/2];
        return answer;
    }
	
	// (2) 중앙값 구하기
	public int median2(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int num = array[i];
					array[i] = array[j];
					array[j] = num;
				}
			}
		}
		int answer = array[array.length/2];
		return answer;
	}
}



