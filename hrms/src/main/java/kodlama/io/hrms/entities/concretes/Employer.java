package kodlama.io.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@PrimaryKeyJoinColumn(name="id")
@Entity
@Table(name= "employers")
@Inheritance(strategy =InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User{
	@Column(name = "company_name")
	private String companyName;
	@Column(name="website_adress")
	private String websiteAdress;
	@Column(name="phone_number")
	private String phoneNumber;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvertisement> jobAdvertisement;
}
