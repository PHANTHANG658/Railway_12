package entity;

public enum GraduationRank {
	Excellence("excellence"), Good("good"), Fair("fair"), Poor("poor");

	String xeploai;

	GraduationRank(String xeploai ) {
		{
			this.xeploai = xeploai;
		}
	}

	public static GraduationRank fromValue(String xeploai) {
		for ( GraduationRank category : values()) {
			if (category.xeploai.equals(xeploai))
				return category;
		}
		throw new IllegalArgumentException("Khong phai loai ENUM tuong ung");
	}

}


