package java_baitaptonghop;

import java.time.LocalDate;

public class HocSinhYeu extends HocSinh {
	private int diemthapnhat;
	private LocalDate ngaygapphuhuynh;

	public HocSinhYeu(int tuoi, String hoten, String email, String sdt, int diemthapnhat, LocalDate ngaygapphuhuynh) {
		super(tuoi, hoten, email, sdt);
		this.diemthapnhat = diemthapnhat;
		this.ngaygapphuhuynh = ngaygapphuhuynh;
	}

	public int getDiemthapnhat() {
		return diemthapnhat;
	}

	public void setDiemthapnhat(int diemthapnhat) {
		this.diemthapnhat = diemthapnhat;
	}

	public LocalDate getNgaygapphuhuynh() {
		return ngaygapphuhuynh;
	}

	public void setNgaygapphuhuynh(LocalDate ngaygapphuhuynh) {
		this.ngaygapphuhuynh = ngaygapphuhuynh;
	}

	@Override
	public String toString() {
		String thongtin = "  tuoi: " + this.getTuoi() + "  ten " + this.getHoten() + "   email:  " + this.getEmail()
				+ "  sdt:  " + this.getSdt() + " diemthapnhat " + this.getDiemthapnhat() + " ngay gap phu huynh "
				+ this.ngaygapphuhuynh;
		return thongtin;
	}

}
