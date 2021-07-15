package problem;

import java.util.Scanner;

public class ex1018 {

	public static void main(String[] args) {
//		어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
//
//		참고
//		scanf( ) 함수는 지정한 형식(format)에 따라 입력받는 함수이다.
//		따라서, 입력받고자 하는 형식으로 표현해주면 된다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력하세요");
		String a = scan.next();
		String b = scan.next();
		
		System.out.printf("%s:%s",a,b);
	}

}
