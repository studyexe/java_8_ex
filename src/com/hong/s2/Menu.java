package com.hong.s2;

import java.util.Scanner;

public class Menu {

	public void order() {
		Scanner sc = new Scanner(System.in);
		Shef_Steak s1= new Shef_Steak();
		Shef_Pasta p1 =new Shef_Pasta();
		Bill bill=new Bill();
		System.out.println("1.안심스테이크");
		System.out.println("2.등심스테이크");
		System.out.println("3.립스테이크");
		System.out.println("4.크림파스타");
		System.out.println("5.로제파스타");
		System.out.println("6.알리오올리오");

		int select=sc.nextInt();
		Food_Steak steak=null;
		Food_Pasta pasta=null;
		if(0<select&&select<=3) {

			steak=s1.makeSteak(select);
			bill.billSteak(steak);

		}
		if(select>=4&&select<=6) {	
			pasta = p1.makePasta(select-3);
			
			bill.billPasta(pasta);

		}

	}


}
