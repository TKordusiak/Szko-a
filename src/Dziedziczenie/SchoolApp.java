package Dziedziczenie;

public class SchoolApp {

	public static void main(String[] args) {
		School school = new School();
		school.add(new StudentClassroom("Tom", "Kor", 5599, "Helveta", "Piek³o"));
		school.add(new StudentClassroom("Bat", "Bel", 666, "Helveta", "Piek³o"));
	
	System.out.println("Uczniowie: ");
		System.out.println(school);
	}
	

}
