package com.hong.s1;

import java.util.Scanner;

public class SchoolController {
	//메서드 명은  start 
	//return  x
	//내용 
	//1 . 학생 등록(추가)
	//2 . 성적 입력
	//3 . 성적 조회
	//4 . 전체 조회
	//5 . 프로그램 종료

	public void start() {
		int select = 0;
		boolean check = true;
		Student [] student1= null;
		Scanner sc= new Scanner(System.in);
		StudentService ss= new StudentService();
		StudentView sv = new StudentView();

		while(check) {
			System.out.println("번호를 입력해주세요");
			System.out.println("1.학생 등록 |2. 성적 입력 |3. 성적 조회 |4. 전체 조회 |5.프로그램 종료");
			select = sc.nextInt();
			switch(select) {

			case 1:

				student1=ss.addStudent();
				break;
			case 2:
				
				ss.addPoint(student1);
				break;
			case 3:
				
				System.out.println("3 . 학생 조회");
				break;
			case 4:
				sv.view(student1);
				break;
			case 5:

				System.out.println("5 . 프로그램 종료");
				check = false;
				break;
			default :
				System.out.println("없는 번호입니다. 다시 선택해주세요.");
				continue;
			}//switch

		}//while

	}
}