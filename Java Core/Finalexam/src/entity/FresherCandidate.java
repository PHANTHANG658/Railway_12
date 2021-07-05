package entity;

public class FresherCandidate extends Candidate {
	GraduationRank GraduationRank;
	
	public FresherCandidate() {
		super();
	}
	public GraduationRank getGraduationRank() {
		return GraduationRank;
	}

	public void setGraduationRank(GraduationRank graduationRank) {
		GraduationRank = graduationRank;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"GraduationRank"+this.GraduationRank;
	}

}
