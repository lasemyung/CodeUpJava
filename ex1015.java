package problem;

import java.util.Scanner;

public class ex1015 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("실수 하나를 입력하되 최소 소숫점 4자리까지 입력하세요");
		float f = scan.nextFloat();
		System.out.printf("%.4f",f);
	}

}
