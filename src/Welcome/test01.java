package Welcome;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");

		while (true) {
			int num = scanner.nextInt();

			if (num > 0) {
				System.out.println("양수");
			} else if (num < 0) {
				System.out.println("음수");
			} else if (num == 0) {
				System.out.println("0");
			} else {
				System.out.println("다시 입력 하시오.");
			}
		}
	}
}
