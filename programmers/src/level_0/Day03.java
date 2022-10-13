package level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/*
 * Day 3 사칙연산, 배열, 수학
 * - 나머지 구하기
 * - 중앙값 구하기
 * - 최빈값 구하기
 * - 짝수는 싫어요
 */

public class Day03 {
	public static void main(String[] args) {
		Day03 exam = new Day03();
		
		// (1) 나머지 구하기
		System.out.println(exam.remainder(3, 2));
		
		// (2) 중앙값 구하기
		int[] array = {1, 2, 10, 7, 11};
		System.out.println(exam.median(array));
		
		// (3) 최빈값 구하기
		int[] array1 = {1, 1, 2, 3, 3, 3, 4};
		System.out.println(exam.mode(array1));
		
		// (4) 짝수는 싫어요
		int[] array2 = exam.oddNumber(11);
		System.out.println(Arrays.toString(array2));
		
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
	
	// (3) 최빈값 구하기
	public int mode(int[] array) {
		
		if (array.length == 1) {
			return array[0];
		}
		
		// 리스트로 변경
		ArrayList<Integer> arrayToList = new ArrayList<>();
		for (int a : array) {
			arrayToList.add(a);
		}
		
		// 중복 제거
		HashSet<Integer> distinctHs = new HashSet<>(arrayToList);
		
		// 개수 확인
		HashMap<Integer, Integer> distinctHm = new HashMap<>();
		for (int a : distinctHs) {
			distinctHm.put(a, Collections.frequency(arrayToList, a));
		}
		
		// 내림차순 정렬
		ArrayList<Integer> keyList = new ArrayList<>(distinctHm.keySet());
		Collections.sort(keyList, (value1, value2) -> (distinctHm.get(value2).compareTo(distinctHm.get(value1))));
		
		int answer = 0;
		
		// 중복값 존재 시 return -1, 없으면 첫번째 값 return
		if (distinctHm.get(keyList.get(0)) == distinctHm.get(keyList.get(1))) {
			answer = -1;
		} else {
			for (int key : distinctHm.keySet()) {
				if (distinctHm.get(key) == distinctHm.get(keyList.get(0))) {
					answer = key;
				}
			}
		}
		return answer;
    }
	
	// (4) 짝수는 싫어요
	public int[] oddNumber(int n) {
		int size = n%2 == 0 ? n/2 : n/2+1;
		int[] answer = new int[size];
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				answer[cnt] = i;
				cnt++;
			}
		}
        return answer;
	}
	
}
