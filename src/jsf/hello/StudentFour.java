package jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFour {
	
	private String firstName;
	private String lastName;
	
	//select more language
	private String [] favLanguages;
	
	//constructor
	public StudentFour() { }

	//getters/setters
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

	public String[] getFavLanguages() {
		return favLanguages;
	}

	public void setFavLanguages(String[] favLanguages) {
		this.favLanguages = favLanguages;
	}
	
}
