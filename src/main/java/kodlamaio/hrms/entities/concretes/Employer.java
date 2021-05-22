package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

@Data
public class Employer implements User{
	private int id;
	private String companyName;
	private String website;
	private String phone_number;
	private String email;
	private String password;
	
	public Employer(int id, String companyName, String website, String phone_number, String email, String password) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.website = website;
		this.phone_number = phone_number;
		this.email = email;
		this.password = password;
	}
	
	
}
