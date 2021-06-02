package kodlama.io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{
	
	@Query("From JobAdvertisement where isActive=true")
	List<JobAdvertisement> getAllByActive();
	
	@Query("From JobAdvertisement where isActive=true Order By createdDate ASC")
	List<JobAdvertisement> getAllActiveSorted();
}
