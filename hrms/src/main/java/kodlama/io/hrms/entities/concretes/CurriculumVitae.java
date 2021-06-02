package kodlama.io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="curriculum_vitaes")
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumVitae {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@OneToMany(mappedBy="curriculumVitae")
	@JsonIgnore
	private List<ForeignLanguage> language;
	
	@OneToMany(mappedBy="curriculumVitae")
	@JsonIgnore
	private List<School> school;
	
	@OneToMany(mappedBy="curriculumVitae")
	@JsonIgnore
	private List<Technology> technology;
	
	@OneToMany(mappedBy="curriculumVitae")
	@JsonIgnore
	private List<JobExperience> jobExperience;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linked_link")
	private String linkedLink;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@Column(name="cv_status")
	private boolean cvStatus;

}
