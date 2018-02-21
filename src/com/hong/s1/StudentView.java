package com.hong.s1;

public class StudentView {
	//학생 정보를 출력

	//메서드 명은 view
	//학생들 정보 출력
	//4



	public void view(Student[] student1) {

		for(int i=0;i<student1.length;i++) {

			System.out.println("이름 : "+student1[i].name);
			System.out.println("번호 : "+student1[i].num);
			System.out.println("국어점수 : "+student1[i].kor);
			System.out.println("영어점수 : "+student1[i].eng);
			System.out.println("수학점수 : "+student1[i].math);
			System.out.println("총점 : "+student1[i].total);
			System.out.println("평균 : "+student1[i].avg);
		}

	}

	public void viewStudent(Student student) {
		if(student.name==null) {
			System.out.println("해당 번호 없음");
		}else {
			System.out.println("이름 : "+student.name);
			System.out.println("번호 : "+student.num);
			System.out.println("국어점수 : "+student.kor);
			System.out.println("영어점수 : "+student.eng);
			System.out.println("수학점수 : "+student.math);
			System.out.println("총점 : "+student.total);
			System.out.println("평균 : "+student.avg);
		}
	}

}
