package entity;

public   class Candidate {
	String FirstName;
	String LastName;
	String Phone;
	String Email;
	
	public Candidate() {
		super();
		
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " FirstName"+this.FirstName+"LastName"+this.LastName+"phone"+this.Phone+"email"+this.Email;	}
	
}
