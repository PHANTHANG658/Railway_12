package les_4;

import java.util.Date;

public class Account {

	int id;
	String email;
	String userName;
	String fullName;
  Date createdate;
  posittion   posittion ;
	
	
	public Account( int id , String email, String fristname, String lastname,Date createdate ) {
		this.id =id;
		this.fullName = lastname+fristname;
		this.createdate = new Date();
	}
	 public Account(int id , String email, String fristname, String lastname,Date createdate , posittion   posittion ) {
			this.id =id;
			this.fullName = lastname+fristname;
			this.createdate = new Date();
			this.posittion =posittion;
			this.posittion.posisitionname =posittion.posisitionname;
	
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public posittion getPosittion() {
		return posittion;
	}
	public void setPosittion(posittion posittion) {
		this.posittion = posittion;
	}}
