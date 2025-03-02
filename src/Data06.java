

//예제 : 실수 형태의 자료형 저장하기

public class Data06 {

	public static void main(String[] args) {
		
	//	int a = (int)23.7; //컴파일 에러가 발생하여 캐스팅(강제형변환)작업을 해서
						   //23.7 -> 23으로 변환해서 저장해야 함
		
		//그러나 자바에서는 실수형 데이터를 저장하기 위한 변수메모리 만들떄 사용되는
		//2가지 자료형을 제공 해줍니다.
		
		//참고.
		//     1.  float   4byte크기의 실수값 저장할 변수메모리 만들 자료형
		//     2.  double  8byte크기의 실수값 저장할 변수메모리 만들 자료형
				
				 //컴파일 에러 발생 
	//	float b = 23.7; //23.7은 자바에서 23.7D로 인식합니다.
						//즉!~ double변수(8byte)에 저장될 값으로 인식합니다.
		
	 // double c = 23.7D;로 인식하기 떄문에  저장가능.	
		double c = 23.7;
		
		//float자료형으로 선언된 변수 d에 float자료형 실수(4byte변수메모리에 저장된 실수값)가 저장되게 하려면
		//실수값 뒤에  접미사f를 붙여서 실수값을 저장해야 합니다.
		float d = 23.7f;
		
		System.out.println("c : " + c); //23.7 <- double c변수에 저장된 23.7D
		System.out.println("d : " + d); //23.7 <- float d변수에 저장된 23.7f
		
	/*
	 	자바에서 float자료형으로 변수 선언후 저장할 값의 허용범위
	 	
	 	   약 -3.40282347E+38(-2의 128승)   ~  약 3.40282347E+38(2의 128승)
	 
	 	   float자료형은 32비트(4바이트) 부동 소수점 숫자를 저장하는데 사용됨
	 	   
	 
	 	자바에서 double자료형으로 변수 선언후 저장할 값의 허용범위
	 	
	 	   약 -1.79769313486231570E+308(-2의 1024승)
	 	   ~
	 	   약  1.79769313486231570E+308(2의 1024승)
	 	   
	 	   double자료형은 64비트(8바이트)  부동 소숫점 숫자를 저장하는데 사용됩니다
	 	   
	 
	 */	
		
		

	}

}







