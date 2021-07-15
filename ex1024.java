package problem;

import java.util.Scanner;

public class ex1024 {

	public static void main(String[] args) {

//		단어를 1개 입력받는다.
//		입력받은 단어(영어)의 각 문자를
//		한줄에 한 문자씩 분리해 출력한다.

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		int len = s.length();
		for (int i = 0; i < len; i++) {
			System.out.printf("\'%c\'", s.charAt(i));
			// len = s문자열의 길이만큼
			// for문에서 인덱스는 0부터 s문자열의 길이(s)만큼 반복
			// 출력문에서 각각 's[0]' ~'s[s]' 반복실행
 		}
	}
}
