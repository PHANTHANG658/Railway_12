package datalayer;

import java.sql.SQLException;
import java.util.List;

import entity.Candidate;

public interface ICandidateRepository {
	List<Candidate> getListCandidate() throws SQLException, ClassNotFoundException;
	Candidate login(String email, String password) throws Exception;
	void register()  throws SQLException, ClassNotFoundException;
	void hienthids() throws SQLException, ClassNotFoundException;
	}

