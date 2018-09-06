package Dziedziczenie;

public class Student_School extends Student{
	
	private String nameSchool;
	

	public String getNameSchool() {
		return nameSchool;
	}


	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	 public Student_School(String firstName, String lastName, int pesel, String nameSchool) {
			super(firstName, lastName, pesel);
			setNameSchool(nameSchool);
	 }
	 @Override
	 public String toString() {
		 return super.toString()+ " Nazwa szko³y: "+nameSchool;
	 }
}
