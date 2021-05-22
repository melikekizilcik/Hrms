package kodlamaio.hrms.entities.concretes;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

@Data
public class Personnel implements User{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public Personnel(int id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
}
