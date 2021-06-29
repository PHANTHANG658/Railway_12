package Jdbc.connection;

public enum GioiTinh {
 nam("nam"),nu("nu"); 
	private String gioitinh;

GioiTinh(String gioitinh) {
	this.gioitinh = gioitinh;
}
public static GioiTinh fromValue(String gioitinh) {
	for (GioiTinh category : values()) {
		if (category.gioitinh.equals(gioitinh))
			return category;
	}
	throw new IllegalArgumentException("Khong phai loai ENUM tuong ung");
}
public String getGioitinh() {
	return gioitinh;
}
public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
}

}



