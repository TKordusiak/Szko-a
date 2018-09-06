package Dziedziczenie;


public class School {
	private final int MAX_PERSON = 2;
	
	private Student[] students;
	private int studentsNumber;
	
	public Student[] getStudents() {
		return students;
	}
	public int getStudentsNumber() {
		return studentsNumber;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public void setStudentsNumber(int studentsNumber) {
		this.studentsNumber = studentsNumber;
	}
	
	public School() {
		setStudents(new Student[MAX_PERSON]);
		setStudentsNumber(0);
	}
	public void add(Student student) {
		if(getStudentsNumber()<MAX_PERSON) {
			getStudents()[getStudentsNumber()]= student;
			setStudentsNumber(getStudentsNumber()+1);
		}
		
	}
	@Override
	public String toString() {
		String result = " ";
		for(int i = 0; i<studentsNumber; i++) {
			result = result + students[i]+"\n";
		}
		return result;
	}

}
