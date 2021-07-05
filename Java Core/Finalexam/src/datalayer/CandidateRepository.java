package datalayer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Utils.MySQLConnUtils;
import entity.Candidate;
import entity.ExperienceCandidate;
import entity.FresherCandidate;

public class CandidateRepository<JdbcUltils> implements ICandidateRepository {
	private MySQLConnUtils jdbcUtils;

	public CandidateRepository() {
		jdbcUtils = new MySQLConnUtils();
	}

	@Override
	public List<Candidate> getListCandidate() throws SQLException, ClassNotFoundException {
		List<Candidate> ds = new ArrayList();
		String sql = "SELECT FirstName,LastName,Phone,Email,ExpInYear,ProSkill,GraduationRank" + "from Candidate";

		Connection connection = jdbcUtils.getMySQLConnection();
		Statement Statement = connection.createStatement();
		ResultSet rs = Statement.executeQuery(sql);
		while (rs.next()) {
			String FirstName = rs.getString("FirstName ");
			String LastName = rs.getString("LastName ");
			String phone = rs.getString("Phone");
			String email = rs.getString("email");
			int ExpInYear = rs.getInt("ExpInYear");
			String ProSkill = rs.getString("ProSkill");
			String GraduationRank = rs.getString("graduationRank");
			if ((GraduationRank != null) && (ProSkill == null) && (ExpInYear==0) {
				FresherCandidate FresherCandidate = new FresherCandidate();
				FresherCandidate.setFirstName(FirstName);
				FresherCandidate.setLastName(LastName);
				FresherCandidate.setPhone(phone);
				FresherCandidate.setEmail(email);
				FresherCandidate.setGraduationRank(entity.GraduationRank.fromValue(GraduationRank));
				ds.add(FresherCandidate);
			}
			else {
				ExperienceCandidate ExperienceCandidate = new ExperienceCandidate();
				ExperienceCandidate.setFirstName(FirstName);
				ExperienceCandidate.setLastName(LastName);
				ExperienceCandidate.setPhone(phone);
				ExperienceCandidate.setEmail(email);
				ExperienceCandidate.setProSkill(ProSkill);
				ExperienceCandidate.setExpInYear(ExpInYear);
				ds.add(ExperienceCandidate);
			}

		}
		return ds;
	}

	@Override
	public void register() throws SQLException, ClassNotFoundException {
		List<Candidate> ds = getListCandidate();
	
		for (int i =0;i<ds.size();i++) {
			if( ds.get(i).getEmail() == null)
				throw  new ExceptionInInitializerError("email sai dinh dang");
			else
			{ if(ds.get(i).getEmail().contains("@vti.com.vn"))
				System.out.println("email dung dinh dang");
			else
				throw new ExceptionInInitializerError("sai dinh dang");	
			}
			if(ds.get(i).getPhone() ==null)
				throw  new ExceptionInInitializerError("chua co so dien thoai");
			else
			{  if(9 <ds.get(i).getPhone().length() && ds.get(i).getPhone().length() <12)
			  System.out.println("so dien thoai dung dinh dang");
			else
				throw new ExceptionInInitializerError("sai dinh dang so");
			}
			
			
		 
			
			
			
			
			
			
			
			
			
			
			
		}
	}

	@Override
	public Candidate login(String email, String password) throws Exception {

		return null;

	}

	@Override
	public void hienthids() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
