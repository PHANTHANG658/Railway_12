package java_baitaptonghop;

public class HocSinh  {
  private int tuoi ;
  private String hoten;
  private String email;
  private String sdt;
public HocSinh(int tuoi, String hoten, String email, String sdt) {
	super();
	this.tuoi = tuoi;
	this.hoten = hoten;
	this.email = email;
	this.sdt = sdt;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSdt() {
	return sdt;
}
public void setSdt(String sdt) {
	this.sdt = sdt;
}
  
}
