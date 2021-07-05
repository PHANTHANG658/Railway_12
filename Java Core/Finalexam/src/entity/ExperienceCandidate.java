package entity;

public class ExperienceCandidate extends Candidate {
	 
	int ExpInYear;
	String ProSkill ;
	
	public int getExpInYear() {
		return ExpInYear;
	}
	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}
	public String getProSkill() {
		return ProSkill;
	}
	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"ExpInYear"+this.ExpInYear+"ProSkill"+this.ProSkill;
	}
	
	 
}
