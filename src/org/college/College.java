package org.college;

public class College {
	public void collegeName() {
		System.out.println("N.B.K.R IST");

	}
	public void collegeCode() {
		// TODO Auto-generated method stub
System.out.println("nbkr");

	}
	public void collegeRank() {
		// TODO Auto-generated method stub
System.out.println("5");
System.out.println("5");
System.out.println("5");
System.out.println("5");
System.out.println("5");
	}
	public static void main(String[] args) {
		College c=new College();
		Dept d=new Dept();
		Hostel h=new Hostel();
		Student s=new Student();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		d.deptname();
		h.hostelName();
		s.studentDept();
		s.studentId();
		s.studentName();
	}
}
