package com.bh.b4;

public class S4Main {

	public static void main(String[] args) {
		
		Tiger tiger = new Tiger();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		tiger.sound();
		tiger.wash();
		cat.sound();
		cat.drop();
		dog.sound();
		dog.guard();
		System.out.println(" ");
		
//		case(우리)를 준비
//		배열
//		모으려고하는데이터타입 [] 변수명;
//		Tiger is a Animal
//		Tiger type은 Animal type이다.
//		Animal animal; //추상클래스는 객체생성 불가능
		Animal animal = tiger;
		
//		Cat타입은 Animal타입이다.
		animal = cat;
		animal = dog;
		
		Animal [] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = dog;
		
		for(int i=0;i<animals.length;i++) {
			animals[i].sound();
		}
		
		System.out.println("=====================");
		
		Animal a = animals[1]; //cat
		
		tiger = (Tiger)a;
		tiger.sound();
		tiger.wash();
		
		System.out.println(a instanceof Tiger); //false
		
		System.out.println("====================");
		Animal animal2 = new Animal();
		Tiger tiger2 = (Tiger)animal2;
		tiger2.sound();
		tiger2.wash();

	}

}
