package hello;

import bean.HelloSpring4Bean02;

public class HelloSpring4App02 {
	
	// 간단한 인사말을 출력하는 프로그램 작성 02
	
	// 외부 클래스를 통해 인사말을 구현하는 기능 구현
	// 인삿말을 출력하기 위해
	//외부 클래스를 객체화한 뒤	sayHello 메서드 호출

	// 한편 HelloSpring4 App02을 실행하려면
	// HelloSpring4Bean02라는 클래스가 반드시! 있어야 함

	// 즉, 클래스 간의 의존성dependency이 생긴다
	// 의존성이 커짐으로 발생하는 부수적인 단점은
	// 코드 변경 시 그것과 연관되는 다른 클래스에도 영향을 미침
	// 유지보수의 범위가 넓어짐 

	// 해결책 : 인터페이스를 도입해서 객체 간 의존성을 낮춤
	
	public static void main(String[] args) {
		HelloSpring4Bean02 bean = new HelloSpring4Bean02();
		bean.sayHello();
	}

}

