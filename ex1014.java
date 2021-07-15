package problem;

import java.util.Scanner;

public class ex1014 {

	public static void main(String[] args) {
//		2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		
		 System.out.printf("%s %s", b, a);
		 // %s 문자열 , %s %s 문자열 2개 입력 , b / a 순으로 입력
	}

}
