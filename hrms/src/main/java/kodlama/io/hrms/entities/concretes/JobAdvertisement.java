package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_advertisement")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","City"})
public class JobAdvertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "job_titles_id")
	private Job job;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@Column(name ="job_explanation")
	private String jobExplanation;
	

	@Column(name="min_wage")
	private int minWage;
	
	@Column(name="max_wage")
	private int maxWage;
	
	@Column(name="amount_of_open_positions")
	private int amountOfOpenPositions;
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="created_date")
	private LocalDateTime createdDate = LocalDateTime.now();
	
	@Column(name = "is_active",columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	
	
	
}
