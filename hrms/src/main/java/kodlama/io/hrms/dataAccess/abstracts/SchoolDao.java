package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School,Integer>{

}
