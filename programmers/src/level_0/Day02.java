package level_0;

import java.util.Arrays;

/*
 * Day 2 사칙연산, 조건문, 배열
 * - 두 수의 나눗셈
 * - 숫자 비교하기
 * - 분수의 덧셈
 * - 배열 두 배 만들기
 */

public class Day02 {
	public static void main(String[] args) {
		Day02 exam = new Day02();
		
		// (1) 두 수의 나눗셈
		int result1 = exam.division(3, 2);
		System.out.println(result1);
		
		// (2) 숫자 비교하기
		int result2 = exam.comparison(11, 11);
		System.out.println(result2);
		
		// (3) 분수의 덧셈
		int[] result3 = exam.fraction(12, 23, 45, 20);
		System.out.println(Arrays.toString(result3));
		
		// (4) 배열 두 배 만들기
		int[] numbers = {1, 2, 100, -99, 1, 2, 3};
		int[] result4 = exam.doubleArray(numbers);
		System.out.println(Arrays.toString(result4));
		
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
	
	// (3) 분수의 덧셈
	public int[] fraction(int denum1, int num1, int denum2, int num2) {
		
		// 두 분모의 최대공약수, 최소공배
		int gcd = gcd(num1, num2);
		int lcm = lcm(num1, num2, gcd);
		
		// 분자에 몇을 곱해야 하는지 체크
		int mul1 = lcm / num1;
		denum1 *= mul1;
		int mul2 = lcm / num2;
		denum2 *= mul2;
		
		int denum = denum1 + denum2;
		
		// 기약분수 구하기
		int gcd2 = gcd(denum, lcm);
		
		int[] answer = {denum / gcd2, lcm / gcd2};
        return answer;
	}
	
	// 최대공약수(유클리드 호제법)
	public int gcd(int num1, int num2) {
		boolean stop = false;
		
		int temp1 = num1;
		int temp2 = num2;
		
		while (!stop) {
			if (temp2 == 0) {
				break;
			}
			if (temp2 != 0 || temp1 % temp2 != 0) {
				int temp = temp1;
				temp1 = temp2;
				temp2 = temp % temp2;
			} else {
				stop = true;
			}
		}
		return temp1; 
	}
	
	// 최소공배수
	public int lcm(int num1, int num2, int gcd) {
		return (num1 * num2) / gcd;
	}
	
	// (4) 배열 두 배 만들기
	public int[] doubleArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] *= 2;
		}
        return numbers;
    }
	
}
