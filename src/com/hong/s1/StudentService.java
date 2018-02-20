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



	//메서드 명은 addPoint
	//각학생의 점수 입력
	//
	public void addPoint(Student[] student1) {
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<student1.length;i++) {
			System.out.println(student1[i].name+"의 국어 점수 입력");
			student1[i].kor=sc.nextInt();
			System.out.println(student1[i].name+"의 영어 점수 입력");
			student1[i].eng=sc.nextInt();
			System.out.println(student1[i].name+"의 수학 점수 입력");
			student1[i].math=sc.nextInt();

			student1[i].total= student1[i].kor+student1[i].eng+student1[i].math;
			student1[i].avg=(double)student1[i].total/3;


		}
	}


	//search 메서드명
	//번호를 입력받아서 학생 한명을 찾아서
	//해당 출력은 StudentView class의 viewStudent메서드에서 출력

	public Student search(Student[] student1) {
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 번호를 입력하세요.");
		int num =sc.nextInt();
		boolean check=true;
		int index=0;

		for(int i =0;i<student1.length;i++) {
			if(num==student1[i].num) {
				check = false;
				index=i;

			}	
		}
		

		return student1[index];

	}




}
