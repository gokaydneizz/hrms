package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{
	List<Candidate> findAllByEmail(String email);
	List<Candidate> findAllByNationalId(String nationalId);
 }
