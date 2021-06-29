package Jdbc.connection;

import java.util.Date;

public class HS {
	private int mahs;
	private String ten;
	private int tuoi;
	private String lop;
	private String hocluc;
	private Date ngaysinh;
	private float diemtongket;
	private GioiTinh GioiTinh;

	public HS() {
		super();
	}

	public int getMahs() {
		return mahs;
	}

	public void setMahs(int mahs) {
		this.mahs = mahs;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getHocluc() {
		return hocluc;
	}

	public void setHocluc(String hocluc) {
		this.hocluc = hocluc;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public float getDiemtongket() {
		return diemtongket;
	}

	public void setDiemtongket(float diemtongket) {
		this.diemtongket = diemtongket;
	}

	public GioiTinh getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(GioiTinh gioiTinh) {
		GioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "mahs:" + this.mahs + "\n" + "ten:" + this.ten + "\n" + "gioi tinh:" + this.GioiTinh + "\n" + "--tuoi:"
				+ this.tuoi + "\n" + "lop:" + this.lop + "\n"
               +"hocluc:"+this.hocluc+"\n"
				+ "ngay sinh:" + this.ngaysinh + "\n" + "diem tong ket:" + this.diemtongket;
	}
}
