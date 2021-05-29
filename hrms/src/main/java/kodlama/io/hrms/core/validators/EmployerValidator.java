package kodlama.io.hrms.core.validators;

import kodlama.io.hrms.entities.concretes.Employer;

public class EmployerValidator {
	public static boolean ifEmpty(Employer employer) {
		if(employer.getCompanyName().isEmpty() || employer.getWebsiteAdress().isEmpty() || employer.getPhoneNumber().isEmpty()
				|| employer.getEmail().isEmpty() || employer.getPassword().isEmpty()) {
			return false;
		}
		return true;
		
	}
}
