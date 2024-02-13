package com.example.demo.binding;

public class CitizenRequest {
	
	private String name;
	
	private String dob;
	
	private String ssn;

	public CitizenRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "CitizenRequest [name=" + name + ", dob=" + dob + ", ssn=" + ssn + "]";
	}
	
	
	

}
