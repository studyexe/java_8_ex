package com.hong.s2;

public class Food_Main {

	public static void main(String[] args) {
	
		
		Shef_Steak shef= new Shef_Steak();
		Food_Steak steak =shef.makeSteak(3);
		System.out.println(steak.name);
		System.out.println(steak.price);
		System.out.println(steak.source.oilName);
		System.out.println(steak.source.spiceName);
		
		
		
		
		
		
		/*	Food_Pasta pasta = new Food_Pasta();
		pasta.name="크림파스타";
		pasta.price=15000;
		System.out.println(pasta.source);
		
		pasta.source=new Food_Source();
		System.out.println(pasta.source.oilname);
		
		pasta.source.oilname="olive";
		pasta.source.spicename="hub";
		
		
		Food_Pasta pasta2 = new Food_Pasta();
		
		System.out.println(pasta2.source.oilname);
		
		//소스 : 오일,향신료,
		
		for(int i =0;i<2;i++) {
		Food_Steak steak = new Food_Steak();
		steak.name = "티본스테이크";
		steak.price= 40000;
		}
		//pasta.name =steak.name;
		//pasta.price=steak.price;
		//pasta=steak;타입이 다르다.
*/		
		
	}

}
