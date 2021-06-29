package Jdbc.connection;

import java.util.Date;

public class HocSinhGioi extends HS {
	private MonThiHSG mon;
	
	public MonThiHSG getMon() {
		return mon;
	}

	public void setMon(MonThiHSG mon) {
		this.mon = mon;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"\n mon tham gia doi tuyen hoc sinh gioi:"+this.mon;
}

	
}
