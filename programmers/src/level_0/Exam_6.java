package level_0;

/*
 * Day 4 수학, 배
 * - 피자 나눠 먹기 (1)
 * - 피자 나눠 먹기 (2)
 * - 피자 나눠 먹기 (3)
 * - 배열의 평균값
 */

public class Exam_6 {
	public static void main(String[] args) {
		Exam_6 exam = new Exam_6();
		
		System.out.println(exam.pizza(15));
		System.out.println(exam.pizza2(10));
		System.out.println(exam.pizza3(4, 12));
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(exam.average(array));
		
	}
	
	// (1) 피자 나눠 먹기 (1)
	public int pizza(int n) {
		return n%7 == 0 ? n/7 : n/7+1;
    }
	
	// (2) 피자 나눠 먹기 (2)
	public int pizza2(int n) {
		
		if (n == 6) {
			return 1;
		}
		
		int num1 = n;
		int num2 = 6;
		
		while (true) {
			if (num2 == 0) {
				break;
			}
			if (num2 != 0 || num1 % num2 != 0) {
				int num = num1;
				num1 = num2;
				num2 = num % num2;
			} else {
				break;
			}
		}
				
		return (n * 6 / num1) / 6;
	}
	
	// (3) 피자 나눠 먹기 (3)
	public int pizza3(int slice, int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (n <= i * slice) {
				answer = i;
				break;
			}
		}
		return answer;
	}
	
	// (4) 배열의 평균값
	public double average(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
        	sum += num;
        }
        double answer = (double)sum/numbers.length;
        return answer;
    }
}
