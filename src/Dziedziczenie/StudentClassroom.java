package Dziedziczenie;

public class StudentClassroom extends Student_School{
	
	private String classRoom;
	

	public String getClassRoom() {
		return classRoom;
	}


	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public StudentClassroom(String firstName, String lastName, int pesel, String nameSchool, String classRoom) {
		super(firstName, lastName, pesel, nameSchool);
		setClassRoom(nameSchool);
	}
	@Override
	public String toString() {
		return super.toString()+ " klasa: "+classRoom;
	}
}
