package problem;

import java.util.Scanner;

public class ex1020 {

	public static void main(String[] args) {
//		주민번호는 다음과 같이 구성된다.
//
//		XXXXXX-XXXXXXX
//
//		앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
//		주민번호를 입력받아 형태를 바꿔 출력해보자.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주민 번호를 입력해 주세요");
		
		String a =scan.next();
		
		 a = a.replaceAll("-","");
		//문자열 치환 - 을 공백으로 바꿔줌
		 System.out.println(a);
	}

}
