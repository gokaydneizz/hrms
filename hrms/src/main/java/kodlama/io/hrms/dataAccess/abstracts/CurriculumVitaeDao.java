package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae,Integer>{

}
