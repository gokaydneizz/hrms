package kodlama.io.hrms.core.validators.concretes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import kodlama.io.hrms.core.validators.abstracts.FakeMernisCheckService;
import kodlama.io.hrms.entities.concretes.Candidate;
import kodlama.io.hrms.entities.concretes.Employer;
@Primary
@Component
public class FakeMernisCheckManager implements FakeMernisCheckService{

	public boolean checkIfRealOne(Candidate candidate) {
		if(candidate.getNationalId().length() > 11) {
			return false;					
		}
			return true;
		}
	
	
	}
