package hello;

import bean.HelloSpring4Bean04;
import bean.HelloSpring4Bean04Eng;
import bean.HelloSpring4Bean04Jpn;
import bean.HelloSpring4Bean04Kor;

public class HelloSpring4App04{

	// 간단한 인사말을 출력하는 프로그램 작성 04
	
	// 인터페이스를 도입해서 프로그래밍 함 
	// 확장성이 높고 유연한 코드를 작성할 수 있음
	// 또한, 객체 간의 tightly coupled(결합도)도 피할 수 있음

	// 03예에서는 객체 생성할 때 그에 맞는 클래스명을 사용해야 됨
	// 하지만, 인터페이스를 사용하는 경우, 다형성을 기반으로
	// 동일한 변수에 여러 객체를 할당해서 사용할 수 있음

	// 하지만, new 연산자로 객체를 생성하는 코드가 노출
	// 다시 말해, HelloSpring4 Bean04는 
	// HelloSpirng4Bean04 Kor, HelloSpirng4Bean04Eng,
	// HelloSpirng4Bean04Jpn에 의존적이라는 의미

	// 해결 : factory 패턴을 이용해서 
	// 객체 생성을 전담하는 클래스를 만들어
	// 객체 생성과정을 캡슐화함

	public static void main(String[] args) {
		
		//HelloSpirng4Bean04Eng bean = new HelloSpirng4Bean04Eng();
		//HelloSpirng4Bean04Kor bean2 = new HelloSpirng4Bean04Kor();
		//HelloSpirng4Bean04Jpn bean3 = new HelloSpirng4Bean04Jpn();
		
		HelloSpring4Bean04 bean = new HelloSpring4Bean04Eng();
		
		bean.sayHello("Spring4");
		
		bean = new HelloSpring4Bean04Kor();
		bean.sayHello("스프링4");
		
		bean = new HelloSpring4Bean04Jpn();
		bean.sayHello("スプリング4");

	}
}
