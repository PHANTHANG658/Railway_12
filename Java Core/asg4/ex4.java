package les_4;

public class ex4 {
 int id;
	 String hometown;
 float diemhocluc;
  String name;
public ex4(int id, String name,String hometown) {
	super();
	this.id = id;
	this.name = name;
	this.hometown =hometown;
	this.diemhocluc =0;

}
public void setDiemhocluc(float diemhocluc) {
	this.diemhocluc = diemhocluc;
}

public void themdiem(float diemcong)
{
 this.diemhocluc = this.diemhocluc+ diemcong;
}
public String thongtinsv()
{  String xephang =" ";
	if (this.diemhocluc <4)
		xephang= "yeu";
	else if (4<this.diemhocluc && this.diemhocluc<6)
		xephang= "tb";
	else if (6<this.diemhocluc && this.diemhocluc<8)
		xephang= "kha";
	else
		xephang="goi";
	
	String thongtin = this.id+this.hometown+this.name+xephang;
	return thongtin;
	

} }
