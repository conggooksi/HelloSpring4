package hello;

public class HelloSpring4App01 {
	
	// 간단한 인삿말을 출력하는 프로그램 작성
	// 메시지를 출력하는 sayHello메서드를 만들어 호출
	// 단, sayHello메서드를 호출하려면
	// 먼저 HelloSpring4App01에 대한 객체를 생성해야 함
	//
	// 인사말을 출력하는 메서드가 현재 클래스에 있기 때문에
	// 프로그램 확장성 측면에서 봤을 때 제약이 존재 
	// 즉, 유지보수/업무분담의 어려움이 발생
	
	// 해결책 : 인사말을 출력하는 기능을
	// 별도의 클래스로 작성

	public static void main(String[] args) {
		// System.out.println("Hello, World!!");
		
		HelloSpring4App01 app = new HelloSpring4App01();
		app.sayHello();
	}
	
	private void sayHello() {
		System.out.println("Hello, World!!");
	}
}
