package bussinesslayer;

import java.sql.SQLException;
import java.util.List;

import entity.Candidate;

public interface ICandidateService {
	List<Candidate> getListCandidate() throws SQLException, ClassNotFoundException;
	void register()  throws SQLException, ClassNotFoundException;
	Candidate login(String email, String password) throws Exception;
	void hienthids() throws SQLException, ClassNotFoundException;
}
