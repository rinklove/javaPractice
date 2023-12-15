package main;

import data.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("이준호 ", 20, 'M');
		
		p.setName("이준호");
		p.setAge(21);
		p.setGender('M');
		
		//오버라이딩 전에 객체.toString()하면 주소값 나옴
		//toString() 오버라이딩 하면 객체의 정보 출력
		System.out.println(p.toString());
	}

}
