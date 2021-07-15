package problem;

import java.util.Scanner;

public class ex1023 {

	public static void main(String[] args) {
		
//		실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
		
		Scanner scan = new Scanner(System.in);
		
		String f = scan.nextLine();
		String [] b = f.split("\\."); // .부분을 갈라 배열에 넣는다
		System.out.println(b[0]); // 인덱스 0번 (정수) 출력
		System.out.println(b[1]); // 인덱스 1번 (실수) 출력			
	}

}
