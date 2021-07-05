package presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import bussinesslayer.CandidateService;
import bussinesslayer.ICandidateService;
import entity.Candidate;

public class CandidateController {
	ICandidateService  candidateService;
	public CandidateController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException
	{  candidateService = new CandidateService();
	}
	public List<Candidate> getListCandidate() throws SQLException, ClassNotFoundException {
		return candidateService.getListCandidate();
	}
	public void register() throws SQLException, ClassNotFoundException{
		candidateService.register();
	}
	Candidate login(String email, String password) throws Exception {
		return candidateService.login(email, password);
	
	}
	
}

