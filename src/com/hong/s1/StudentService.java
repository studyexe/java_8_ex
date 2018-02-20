package com.hong.s1;

import java.util.Scanner;

public class StudentService {
	//학생 추가 메서드
	//메서드 명 addStudent
	//학생의 인원수를 입력하세요.
	//학생수만큼
	//이름 입력
	//번호 입력
	Student[] student1=null;
	int num;
	
	
	public Student[] addStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		num = sc.nextInt();
		student1 = new Student[num];
		
		for(int i=0;i<student1.length;i++) {
			Student student = new Student();
			student1[i]=student;
			System.out.println(i+1+"번째 이름을 입력하세요.");
			student1[i].name=sc.next();
			System.out.println(i+1+"번째 번호를 입력하세요.");
			student1[i].num=sc.nextInt();
		}
		
		return student1;
	}
	
	
	
}
