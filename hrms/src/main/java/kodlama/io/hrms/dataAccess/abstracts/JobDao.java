package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer> {	
	List<Job> findAllByTitle(String title);
}
