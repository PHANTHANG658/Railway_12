package bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import datalayer.CandidateRepository;
import datalayer.ICandidateRepository;
import entity.Candidate;

public class CandidateService implements ICandidateService {
 private ICandidateRepository  candidateRepository;

	public CandidateService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		candidateRepository = new CandidateRepository();
	}

@Override
public List<Candidate> getListCandidate() throws SQLException, ClassNotFoundException {
	// TODO Auto-generated method stub
	return candidateRepository.getListCandidate();
}
@Override
public void register() throws SQLException, ClassNotFoundException {
	candidateRepository.register();
	
}
@Override
public Candidate login(String email, String password) throws Exception {
	// TODO Auto-generated method stub
	return candidateRepository.login(email, password);
}

@Override
public void hienthids() throws SQLException, ClassNotFoundException {
	candidateRepository.hienthids();
	}
	
}


	
	
}


