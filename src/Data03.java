
//예제  : 정수형 상수리터럴을 저장하는 변수 메모리 선언(만들기)
public class Data03 {

	public static void main(String[] args) {
		
		// a = 1;  //컴파일 에러 발생 - 선언된 a변수메모리가 없기떄문에 1을 저장할수 없다.
		
		//자바에서는 변수메모리에 저장된 데이터를 꺼내서 사용하기 위해서는
		//먼저 변수메모리를 선언(생성) 해야 합니다.
		
		//변수 메모리 선언(생성) 문법
		//자료형 변수이름;
		
		//int -> 4바이트크기 그리고 정수를 저장할 자료형 
		//int a; -> 4바이트크기의 정수 하나를 저장할 a라는 이름의 변수 메모리 선언(생성) 함 
		int a; // a변수 메모리 [] 를 선언하고,
		
		//선언한 변수메모리에 값 저장 문법
		//변수명 = 저장시킬값;
		a = 1;// a변수 메모리 []에 1정수형 상수값을 저장
			  // a변수 메모리 [1]
		
		//println(a); 구문으로 a변수 메모리[1]에 저장된 1을 얻어 출력후 줄바꿈!
		System.out.println(a); //1
		
		a = 2;//변수 메모리에 다른 값을 대입 하면 변수메모리에 저장된 값은 제거 되고
			  //다른 값을 저장 하여 변수메모리에 저장되는 값을 변경 할수 있다.
			  //1.  a 변수메모리 [ 1 ]
			  //    a = 2;   <-  a변수메모리에 2를 저장
		      //2.  a 변수메모리 [ 2 ] 1은 제거되고 마지막에 저장 시킨 2가 최종 저장된 값임 
		
		//마지막에 대입한 값만 유지되는지 a변수메모리값 출력 해보기
		System.out.println(a);//2
		
		

	}

}




