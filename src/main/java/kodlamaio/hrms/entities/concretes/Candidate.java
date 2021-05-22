package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

@Data
public class Candidate implements User{
	private int id;
	private String firstName;
	private String lastName;
	private String nationlatyId;
	private int birthOfYear;
	private String email;
	private String password;
	
	public Candidate(int id, String firstName, String lastName, String nationlatyId, int birthOfYear, String email,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationlatyId = nationlatyId;
		this.birthOfYear = birthOfYear;
		this.email = email;
		this.password = password;
	}
	
	
}
