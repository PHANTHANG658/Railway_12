package java_baitaptonghop;

public class HocSinhGioi extends HocSinh {
	Mon mon;

	public HocSinhGioi(int tuoi, String hoten, String email, String sdt, Mon mon) {
		super(tuoi, hoten, email, sdt);
		this.mon = mon;
	}

	public Mon getMon() {
		return mon;
	}

	public void setMon(Mon mon) {
		this.mon = mon;
	}

	@Override
	public String toString() {
		String thongtin = "  tuoi: " + this.getTuoi() + "  ten  " + this.getHoten() + "   email:  " + this.getEmail()
				+ "  sdt:  " + this.getSdt() + "doi tuyen mon:" + this.getMon();
		return thongtin;
	}
}
