package Jdbc.connection;


public enum MonThiHSG {
TOAN("toan"), VAN("van") ,ANH("anh") ,LY("ly");

	String mon;
 MonThiHSG(String mon) {
		{
			this.mon = mon;
		}
	}

	public static MonThiHSG fromValue(String mon) {
		for (MonThiHSG category : values()) {
			if (category.mon.equals(mon))
				return category;
		}
		throw new IllegalArgumentException("Khong phai loai ENUM tuong ung");
	}

}


