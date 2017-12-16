package jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentFive {

	private String firstName;
	private String lastName;
	private String favLanguages;
	
	public StudentFive() {
		
		//init obj
		firstName = "Mary";
		lastName ="Smith";
		favLanguages="Ruby";
	}

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

	public String getFavLanguages() {
		return favLanguages;
	}

	public void setFavLanguages(String favLanguages) {
		this.favLanguages = favLanguages;
	}
	
	
	
}
