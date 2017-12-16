package jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	
	private String firstName;
	private String lastName;
	private String country;
	
	//list of options
	List<String> countryOptions;
	
	//constructor
	public StudentTwo() {
		//init list
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("Germany");
		countryOptions.add("India");
		countryOptions.add("Turkey");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States");
		
	}

	// getters & setters methods
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	//Get country drop down list
	public List<String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
}
