package com.hong.s2;

public class Shef_Pasta {
	//메서드명은 makePasta
	//1.크림파스타 15000,소스 2
	//2.로제파스타 20000, 1번
	//3.알리오올리오 30000,1번
	
	public Food_Pasta makePasta(int select) {
		Food_Pasta pasta=null;
		Shef_Source source=new Shef_Source();
		
		switch(select) {
		case 1:
			pasta=new Food_Pasta();
			pasta.name="크림파스타";
			pasta.price=15000;
			pasta.source=source.makeSource(2);
					
			break;
		case 2:
			pasta=new Food_Pasta();
			pasta.name="로제파스타";
			pasta.price=20000;
			pasta.source=source.makeSource(1);
			break;
		case 3:
			pasta=new Food_Pasta();
			pasta.name="알리오올리오";
			pasta.price=30000;
			pasta.source=source.makeSource(1);
			break;
		default:
			
		}
		
		return pasta;
		
	}
}
