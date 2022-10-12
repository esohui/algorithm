package level_0;

import java.util.Arrays;

/*
 * Day 5 수학, 배열
 * - 옷가게 할인 받기
 * - 아이스 아메리카노
 * - 나이 출력
 * - 배열 뒤집기
 */

public class Exam_7 {
	public static void main(String[] args) {
		Exam_7 exam = new Exam_7();
		
		System.out.println(exam.discount(999999));
		System.out.println(Arrays.toString(exam.americano(11000)));
		System.out.println(exam.YOB(40));
		int[] num_list = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(exam.reverse(num_list)));
		
	}
	
	// (1) 옷가게 할인 받기
	public int discount(int price) {
		double ratio = ((price>=500000) ? 0.8 : ((price>=300000) ? 0.9 : ((price>=100000) ? 0.95 : 1.0)));
		return (int)(price * ratio);
	}
	
	// (2) 아이스 아메리카
	public int[] americano(int money) {
		return new int[] { money / 5500, money % 5500 };
    }
	
	// (3) 나이 출력
	public int YOB(int age) {
		return 2022 - (age-1);
    }
	
	// (4) 배열 뒤집기
	public int[] reverse(int[] num_list) {
		int[] answer = new int[num_list.length];
		int cnt = num_list.length-1;
		
        for (int i = 0; i < num_list.length; i++) {
        	answer[i] = num_list[cnt];
        	cnt--;
        }
        return answer;
    }
}
