package problem;

import java.util.Scanner;

public class ex1025 {

	public static void main(String[] args) {
		
//		다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
		
		Scanner scan = new Scanner(System.in);

		String a = scan.nextLine();
		
		String[] b = a.split("");
		
		System.out.println(b[0]+"0000");
		System.out.println(""+b[1]+"000");
		System.out.println(""+b[2]+"00");
		System.out.println(""+b[3]+"0");
		System.out.println(""+b[4]+"");
		
		
	}

}
