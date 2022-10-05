package level_0;

/*
 * Day 2 사칙연산, 조건문, 배열
 * - 두 수의 나눗셈
 * - 숫자 비교하기
 */

public class Exam_2 {
	public static void main(String[] args) {
		Exam_2 exam = new Exam_2();
		
		// (1) 두 수의 나눗셈
		int result1 = exam.division(3, 2);
		System.out.println(result1);
		
		// (2) 숫자 비교하기
		int result2 = exam.comparison(11, 11);
		System.out.println(result2);
		
	}
	
	// (1) 두 수의 나눗셈
	public int division(int num1, int num2) {
        double num = (double)num1 / num2;
        return (int)(num*1000);
    }
	
	// (2) 숫자 비교하기
	public int comparison(int num1, int num2) {
		return num1 == num2 ? 1 : -1;
    }
	
}
