 package ex;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CTRL(COMMAND) + SHIFT + O => 자동으로 해당내용 임포트해오는 단축키 (자동완성 단축키)
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		
		// 콘솔 입력에서 한 라인을 입력 받음
		String input = scanner.nextLine();
		
		// 콘솔 입력에서 문자열을 공백까지 한 단어를 입력 받음
        // String input2 = scanner.next();
		
		// 문자열을 정수로 변환 : Integer.parseInt메소드(함수)
		int num = Integer.parseInt(input);

		System.out.println("입력내용 :" + input);
		System.out.printf("num=%d%n", num);
	}

}