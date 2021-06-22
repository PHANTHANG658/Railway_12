package asg8;

public class Student {
	 int id;
	 String name;
	 static int dem =0;
	public Student( String name) {
		super();
		this.id = ++dem;
	
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String thongtin = "id :"+this.id+"- name:"+this.name;
		return thongtin;
	}
 
}
