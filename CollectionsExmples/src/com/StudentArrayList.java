package com;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setId(101);
		s1.setSname("Adam");
		s1.setMarks(87);
		
		Student s2=new Student();
		s1.setId(102);
		s1.setSname("Harry");
		s1.setMarks(84);
		Student s3=new Student();
		s1.setId(103);
		s1.setSname("Bilop");
		s1.setMarks(82);
		Student s4=new Student();
		s1.setId(104);
		s1.setSname("Hadam");
		s1.setMarks(99);
		Student s5=new Student();
		s1.setId(105);
		s1.setSname("Kane");
		s1.setMarks(87);
		Student s6=new Student();
		s1.setId(106);
		s1.setSname("Henry");
		s1.setMarks(56);
		Student s7=new Student();
		s1.setId(107);
		s1.setSname("Jone");
		s1.setMarks(90);
		Student s8=new Student();
		s1.setId(108);
		s1.setSname("Steve");
		s1.setMarks(81);
		Student s9=new Student();
		s1.setId(109);
		s1.setSname("Zampa");
		s1.setMarks(84);
		Student s10=new Student();
		s1.setId(110);
		s1.setSname("Zaman");
		s1.setMarks(67);
		
		
		
		
		CopyOnWriteArrayList<Student> studentList=new CopyOnWriteArrayList<Student>();
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);
		
		for (Student temp : studentList) {
			char tempchar=temp.sname.charAt(0);
			
			if(tempchar=='H')
			{
				System.out.println("Found H");
				System.out.println("Temp value :"+temp);
			
				if(temp.marks<98) 
				{
					int tempmarks=temp.marks+3;
					temp.setMarks(tempmarks);
					//studentList.set(temp,);
					//studentList.set(temp,temp.id,temp.sname,tempmarks));
				}
			}
			System.out.println("ID :"+temp.id+" Name :"+temp.sname+" Marks :"+temp.marks);
		}
		
	}
	
	static class Student
	{
		int id;
		String sname;
		int marks;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
	}

}
