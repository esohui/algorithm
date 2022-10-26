package introduction;

/*
 * Day 7 문자열, 조건문, 수학, 반복문
 * - 특정 문자 제거하기
 * - 각도기
 * - 양꼬치
 * - 짝수의 합
 */

public class Day07 {
	public static void main(String[] args) {
		Day07 exam = new Day07();
		System.out.println(exam.removeLetter("BCBdbe", "B"));
		System.out.println(exam.protractor(89));
		System.out.println(exam.lambSkewers(64, 6));
		System.out.println(exam.evenSum(10));
	}
	
	// (1) 특정 문자 제거하기
	public String removeLetter(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
	
	// (2) 각도기
	public int protractor(int angle) {
		int answer;
		if (angle == 90) {
			answer = 2;
		} else if (angle == 180) {
			answer = 4;
		} else if (angle < 90) {
			answer = 1;
		} else {
			answer = 3;
		}
        return answer;
    }
	
	// (3) 양꼬치
	public int lambSkewers(int n, int k) {
		int sCnt = n / 10;
        int answer = (n*12000) + (k*2000) - (sCnt*2000);
        return answer;
    }
	
	// (4) 짝수의 합
	public int evenSum(int n) {
		int answer = 0;
		for (int i=2; i<=n; i+=2) {
			answer+=i;
		}
        return answer;
    }
	
}
