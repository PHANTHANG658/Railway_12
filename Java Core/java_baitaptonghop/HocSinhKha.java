package java_baitaptonghop;

public class HocSinhKha extends HocSinh{
	private int diemtb;
	
  public HocSinhKha(int tuoi, String hoten, String email, String sdt, int diemtb) {
		super(tuoi, hoten, email, sdt);
		this.diemtb =diemtb;
	}
public int getDiemtb() {
	return diemtb;
}
public void setDiemtb(int diemtb) {
	this.diemtb = diemtb;
}
@Override
public String toString() {
	String thongtin = "  tuoi: " + this.getTuoi() + "  ten " + this.getHoten() + "   email:  " + this.getEmail()
			+ "  sdt:  " + this.getSdt() +" diem tb :" +this.getDiemtb();
	return thongtin;
}

}
