package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="technologies")
@Entity
public class Technology {
	
	@Id
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="cv_id")
	private CurriculumVitae curriculumVitae;
	
	@Column(name="technology_name")
	private String technologyName;
	
	
}
