package kodlama.io.hrms.services;

import kodlama.io.hrms.entities.concretes.Candidate;

public class FakeMernisService {
	public static boolean nationalIdControl(Candidate  candidate) {
		if(candidate.getNationalId().length() == 11) {
			return true;
		}
		return false;
	}
}
