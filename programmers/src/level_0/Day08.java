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
		int[] emergency = {3, 76, 24};
		System.out.println(Arrays.toString(exam.treatment(emergency)));
		System.out.println(exam.orderedPair(20));
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
	public int[] treatment(int[] emergency) {
		int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
        	answer[i] = 1;
        	for (int j = 0; j < emergency.length; j++) {
        		if (emergency[i] < emergency[j]) {
        			answer[i] = answer[i] + 1;
        		}
        	}
        }
        return answer;
    }
	
	// (4) 순서쌍의 개수
	public int orderedPair(int n) {
		int answer = 0;		
		int sqrt = (int)Math.sqrt(n);
		int	dupCnt = 0;
		
		for (int i = 1; i <= sqrt; i++) {
			answer = n % i == 0 ? answer+1 : answer;
			if (i*i == n) {
				dupCnt++;
				continue;
			}
		}
		return (answer*2)-dupCnt;
	}
}
