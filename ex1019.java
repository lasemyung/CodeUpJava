package problem;

import java.util.Scanner;

public class ex1019 {

	public static void main(String[] args) {
		
//		년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("년 ,월, 일을 입력해 주세요");
//		
//		int year = scan.nextInt();
//		int month = scan.nextInt();
//		int day = scan.nextInt();
//		
//		System.out.printf("%d.%d.%d", year, month, day);	
		
		// 위엔 내가 한 방식
		
		String a = scan.next();
        String[] arr = a.split("\\."); // split 은 입력받은 값에서 안에.을 제거한 뒤 문자열로 나누어 제거
        int A = Integer.valueOf(arr[0]);
        int B = Integer.valueOf(arr[1]);
        int C = Integer.valueOf(arr[2]);
        System.out.printf("%04d.%02d.%02d", A, B, C);
			//%04d의 의미는 4자리 정수를 만들되 부족한 부분은 0을 채워 넣어주어라. ex) 29 -> 0029
	}

}
