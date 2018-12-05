/**
 * 
 */
package com.lnt.day9_collection5_setComparator;

/**
 * @author brije
 *
 */
public class Student implements Comparable<Student>{
	private int studentId;
	private String name;
	private double marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String name, double marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studentId-o.studentId;
		//return this.getName().compareTo(o.getName());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentId;//treating studentId as a hashCode
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();//both the student will be equal if has the same hashCode(studentId)
	}
	
}
