package com.hong.s1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Program Start");
		
		SchoolController school = new SchoolController();
		school.start();
		
		//new SchoolController().start();//한번사용하고 말때 사용. 사용후 주소값을 불러올 수 없다.

	}

}
