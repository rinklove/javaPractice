package review;

public class Review01 {

	
	public void method1() {
		System.out.println("객체~!~!~!");
		/*
		 * 객체: 실존하는 것 // 데이터들의 집합
		 * 객체는 클래스로 만들어짐
		 * 객체는 heap 메모리에 만들어짐
		 * 
		 * static 키워드가 붙은 변수와 메소드들은 객체와 연관x
		 * 
		 * 클래스 파일은 static 메모링 저장된 글자일 뿐
		 */
	}
	
	public void method2() {
		System.out.println("상속~!~!~!");
		/*
		 * 객체는 자신의 부모 객체가 만들어져야 만들어질 수 있음
		 * 부모객체의 멤버를 자식도 사용가능
		 * 생성자:부모 생성자를 호출한 후 자신의 객체를 생성하여 리턴, 오버로딩 가능
		 * 생성자가 명시되어있지 않으면 JVM이 기본 생성자를 만들어줌
		 */
	}
}
