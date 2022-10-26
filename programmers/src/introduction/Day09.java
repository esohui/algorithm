package introduction;

import java.util.HashMap;

/*
 * Day 9 수학, 문자열, 해시, 완전탐색, 조건문
 * - 개미 군단
 * - 모스부호 (1)
 * - 가위 바위 보
 * - 구슬을 나누는 경우의 수
 */

public class Day09 {
	public static void main(String[] args) {
		Day09 exam = new Day09();
//		System.out.println(exam.antCorps(999));
//		System.out.println(exam.morseCode(".... . .-.. .-.. ---"));
//		System.out.println(exam.rockPaperScissors("205"));
		System.out.println(exam.numberOfCases(5, 3));
	}
	
	// (1) 개미 군단
	public int antCorps(int hp) {
		int answer = 0;
		
		while (hp > 0 ) {
			if (hp >= 5) {
				answer += hp/5;
				hp = hp%5;
			} else if (hp >= 3) {
				answer += hp/3;
				hp = hp%3;
			} else {
				answer += hp;
				hp = 0;
			}
		}
		return answer;
    }
	
	// (2) 모스부호 (1)
	public String morseCode(String letter) {
		
		String morseStr = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',"
				+ "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',"
				+ "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',"
				+ "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',"
				+ "'-.--':'y','--..':'z'";
		String[] morseArr = morseStr.split(",");
		String[] letterArr = letter.split(" ");
		
		HashMap<String, String> morse = new HashMap<String, String>();
		
		for (int i = 0; i < morseArr.length; i++) {
			morseArr[i] = morseArr[i].replace("'", "");
			int idx = morseArr[i].indexOf(":");
			morse.put(morseArr[i].substring(0, idx), morseArr[i].substring(idx+1));
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < letterArr.length; i++) {
			sb.append(morse.get(letterArr[i]));
		}
		
        return sb.toString();
    }

	// (3) 가위 바위 보
	public String rockPaperScissors(String rsp) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rsp.length(); i++) {
			switch(rsp.charAt(i)) {
			case '2': sb.append("0"); break;
			case '0': sb.append("5"); break;
			case '5': sb.append("2"); break;
			}
		}
        return sb.toString();
    }
	
	// (4) 구슬을 나누는 경우의 수
	public long numberOfCases(int balls, int share) {
        long answer = factorial(balls) / (factorial(balls-share) * factorial(share));
        return answer;
    }
	
	public long factorial(int num) {
		long rf = 1;
		for (int i=num; i>0; i--) {
			rf *= i;
		}
		return rf;
	}
	
}
