package problem;

import java.util.Scanner;

public class ex1026 {

	public static void main(String[] args) {
		
//		입력되는 시:분:초 에서 분만 출력
//		정수로 출력되도록 형변환
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력하세요");
		
		String a = scan.nextLine();
		
		String[] b = a.split(":");
		
		System.out.println(Integer.parseInt(b[1]));
	}

}
