package hello;

import bean.HelloSpring4Bean03;

public class HelloSpring4App03 {
	
	// 간단한 인사말을 출력하는 프로그램 작성 03

	// 인사말을 한국어, 영어, 일본어로 출력하도록 기능을 개선.
	// 해당 기능을 제각각의 이름으로 호출하는 경우 
	// 지나치게 복잡해지고 기능에 따라 이름을 
	// 일일이 외워야 하는 불편함이 존재함 
	
	// 해결 : 인터페이스를 도입해서 객체 간 의존성을 낮추고
	// 		  메서드 호출을 일원화 시킴
	
	public static void main(String[] args) {
		
		HelloSpring4Bean03 bean = new HelloSpring4Bean03();
		
		bean.sayHelloEng("Spring4");
		bean.sayHelloKor("스프링4");
		bean.sayHelloJpn("スプリング4");
	}
}
