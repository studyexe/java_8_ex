package com.hong.s2;

public class Shef_Steak {

	public Food_Steak makeSteak(int select) {
		//1.안심스테이크 ,3만원 소스 1
		
		//2.등심스테이크, 4만원  소스2
		
		//3. 립스테이크, 5만원 소스1
		Food_Steak steak =null;
		
		Shef_Source source =new Shef_Source();
		
		switch(select) {
		case 1:
			steak = new Food_Steak();
			steak.name="안심스테이크";
			steak.price=30000;
			steak.source=source.makeSource(1);
			break;
		case 2:
			steak = new Food_Steak();
			steak.name="등심테이크";
			steak.price=40000;
			steak.source=source.makeSource(2);
			break;
		case 3:
			steak = new Food_Steak();
			steak.name="립스테이크";
			steak.price=50000;
			steak.source=source.makeSource(1);
			break;
		default:
		 System.out.println("해당 번호 없음");
		 
		}
		
		
		return steak;
		
	}
	
}
