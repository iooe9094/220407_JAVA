package ex;

public class Ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="3";
		
		System.out.println(str.charAt(0) - '0'); 
		// '3' - '0' / 51 - 48 (아스키코드) : 문자열 3
		// 또는 integer.parseInt(str) : 정수로 변경 가능
		// 정수로 바꾸는 로직 1
		
		System.out.println('3' - '0' + 1);
		// '3' - '0' 은 정수로 변경되므로 3 + 1 : 4
		
		System.out.println(Integer.parseInt("3") +1);
		// Integer.parstInt("3") : 3이 되므로 3 + 1 : 4
		
		System.out.println("3" + 1);
		// 문자열 + 정 -> 문자열 이므로 "3" + "1" : "31"
		
		System.out.println((char)(3+'0')); 
		// 0의 아스키코드는 48이므로 3 + 48 : 51임
		// char 51 -> 아스키코드 51번은 3이므로
		// 답은 문자 "3"이 됨
		
	}

}
