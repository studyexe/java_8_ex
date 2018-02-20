package com.hong.s1;

import java.util.Scanner;

public class SchoolController {

	//메서드 명 start
	//리턴은 없음 
	//내용은 
	//1. 학생등록
	//2. 성적입력
	//3. 성적조회
	//4. 전체조회
	//5. 프로그램 종료
	
	public void start() {
		Scanner sc= new Scanner(System.in);
		boolean check=true;
		
		while(check) {
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 학생등록 | 2. 성적 입력 | 3. 성적조회 | 4. 전체조회 | 5. 프로그램 종료");
			int num =sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("학생을 등록 해주세요.");
				break;
				
			case 2:
				System.out.println("성적을 입력해주세요.");
				break;
			case 3:
				System.out.println("성적을 조회 합니다.");
				break;
			case 4:
				System.out.println("전체 내용을 조회 합니다.");
				break;
			case 5:
				System.out.println("프로그램을 종료 합니다.");
				check =false;
				break;
			default : 
				System.out.println("번호를 잘못 입력했습니다. 다시 선택 해주세요.");
				continue;
		
			
			
			}//switch
			
			
			
		}//while
		
	}//start
	
	
	
}
