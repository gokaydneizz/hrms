package kodlama.io.hrms.core.validators;

import kodlama.io.hrms.entities.concretes.Candidate;

public class CandidateValidator {
	
	public static boolean ifEmpty(Candidate candidate) {
		if(candidate.getFirstName().isEmpty() || candidate.getEmail().isEmpty() || candidate.getLastName().isEmpty() || candidate.getNationalId().isEmpty()
				 || candidate.getPassword().isEmpty()){
			return false;
		}
		return true;
		
	}
	
	
	
	
}
