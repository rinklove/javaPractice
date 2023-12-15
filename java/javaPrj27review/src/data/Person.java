package data;

public class Person {

	//멤버 변수
	private String name;
	private int age;
	private char gender;
	
	//기본 생성자
	public Person() {}
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	//멤버 메소드
	public void breath() {
		System.out.println("후하후하");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length()<=3) 
			this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > this.age && age >0)
			this.age = age;
		else {
			System.out.println("현재 나이보다 어리게 넣는 것은 불가능 합니다");
		}
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if(gender == 'M' || gender == 'F')
		this.gender = gender;
		else {
			System.out.println("M, F중에서만 넣을 수 있습니다");
		}
	}
	
	/**
	 * 객체 안의 모든 멤버변수를 리턴하는 메소드
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
