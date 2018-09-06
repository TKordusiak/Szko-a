package Dziedziczenie;

public class Student {
	 private String firstName;
	 private String lastName;
	 private int pesel;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPesel() {
		return pesel;
	}
	public void setPesel(int pesel) {
		this.pesel = pesel;
	}
	
	public Student( String firstName, String lastName, int pesel) {
		setFirstName(firstName);
		setLastName(lastName);
		setPesel(pesel);
	}
	
	@Override
	public String toString() {
		return "Imiê: "+firstName + " Nazwisko: "+lastName + " PESEL: "+pesel;
		
	}

}
