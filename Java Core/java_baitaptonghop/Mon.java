package java_baitaptonghop;

public enum Mon {
	TOAN("toan"), LY("ly"), HOA("hoa");

	String mon;

	Mon(String mon) {
		{
			this.mon = mon;
		}
	}
	public static Mon fromValue(String mon ) {
   for(Mon category :values())
   { if( category.mon.equals(mon))
	   return category;
   }
   throw new IllegalArgumentException("Khong phai loai ENUM tuong ung");
	}
	   
	   
	   
	   
	   
   }

