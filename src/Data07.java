

//예제 : 문자 형태의 자료형 저장하기
public class Data07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 참고.
		 * 문자 상수는 가 문자에 대응되는 정수값 형태를 2진수로 변경해서
		 * 컴퓨터의 특정 영역인 변수 메모리에 저장됩니다.
		 * 
		 * 아스키 코드란? 문자와 일대일 대응관계에 있는 정수코드를 말합니다.
		 * 		대문자 'A'는 10진수 정수로 65
		 * 		소문자 'a'는 10진수 정수로 97
		 * 	
		 * 		정수형태의 문자 '0' - 10진수 정수로 48
		 * 
		 * */
		
		char x;
		x = 'A';

		System.out.printf("%c -> %d \n", x, (int)x);
		
		x = '0';
		System.out.printf("%c -> %d \n",  x, (int)x);
		
		x = 0; //0은 NULL문자를 의미
		System.out.printf("%c -> %d \n", x, (int)x);
		
		x = 'a';
		System.out.printf("%c -> %d \n", x, (int)x);
		
		
		
		
	}

}
