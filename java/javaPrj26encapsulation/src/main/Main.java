package main;

import java.awt.Graphics;

import data.Person;
import data.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----------------캡슐화-----------------");
		
//		Person p  = new Person();
//		private이 붙은 변수는 직접 값을 설정할 수 없음
//		p.name = "ㄹ라라";
//		p.age = 20;
		
//		p.setName("오옹이");
//		System.out.print("안녕하세요 "+p.getName()+"입니다.");
//		System.out.println(" 저는 " +p.getAge()+ "살 입니다");
//		
//		p.setAge(21);
//		p.setAge(-21);
//		
//		System.out.print("안녕하세요 "+p.getName()+"입니다.");
//		System.out.println(" 저는 " +p.getAge()+ "살 입니다");
		
		Pokemon p = new Pokemon("피카츄", 100, 30);
//		p.setName("피카츄");
//		p.setHp(100);
//		p.setAtk(30);
		//get()로 호출. --> 메서드 만들어서 호출
//		p.printInfo();
		System.out.println(p.toString());
	}

}
