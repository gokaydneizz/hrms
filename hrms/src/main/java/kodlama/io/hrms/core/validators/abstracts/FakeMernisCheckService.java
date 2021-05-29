package kodlama.io.hrms.core.validators.abstracts;

import kodlama.io.hrms.entities.concretes.Candidate;

public interface FakeMernisCheckService {
	public boolean checkIfRealOne(Candidate candidate);
}
