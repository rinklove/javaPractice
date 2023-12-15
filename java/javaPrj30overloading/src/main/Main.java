package main;

import data.Person;
import data.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("생성자 오로버딩~");
		
		//생성자를 이용한 초기화
//		Person p1 = new Person("이준호", 26);
//		System.out.println(p1.getFieldInfo());
//		p1.breathe();
//		
//		Person p2 = new Person();
//		p2.setAge(26);
//		p2.setName("이준호");
//		
//		p2.breathe();
//		System.out.println(p2.getFieldInfo());
		
		
		Pokemon p = new Pokemon("피카츄", 85, 15);
		
		System.out.println(p.toString())
		;
	}
}
