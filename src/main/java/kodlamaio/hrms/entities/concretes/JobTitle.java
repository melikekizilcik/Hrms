package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.Job;
import lombok.Data;

@Entity
@Data
@Table(name="job_titles")

public class JobTitle implements Job{
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	public JobTitle() {
		
	}
	
	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

}
