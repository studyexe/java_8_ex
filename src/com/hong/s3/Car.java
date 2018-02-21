package com.hong.s3;

public class Car {
	String color;
	String brand;
	int cc;
	
	public Car() {
		//default ,기본, 빈, 생성자
		this("Red");//자신의 또다른 생성자를 호출//생성자 라인의 제일 첫줄에 기술하여야 한다.
	}

	public Car(String color) {
		this(color,"Audi");
	}
	
	public Car(String color, String brand) {
		this(color, brand, 3000);
	}
	public Car(String color, String brand, int cc) {
		this.color=color;
		this.brand=brand;
		this.cc=cc;
		
	}
	
	public void make() {
		System.out.println("자동차 제작 완료");
	}
	
	
	
	

	public void info() {
		System.out.println("Color : "+this.color);
		System.out.println("Brand : "+this.brand);
		System.out.println("Cc : "+this.cc);
		this.make();
	}
	
}
