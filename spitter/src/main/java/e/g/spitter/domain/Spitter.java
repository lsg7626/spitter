package e.g.spitter.domain;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.springframework.web.multipart.MultipartFile;

public class Spitter implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	@NotNull
	@Size(min=5, max=16, message="{username.size}")
	private String username;
	
	@NotNull
	@Size(min=5, max=25, message="{password.size}")
	private String password;
	
	@NotNull
	@Size(min=2, max=30, message="{firstName.size}")
	private String firstName;
	
	@NotNull
	@Size(min=2, max=30, message="{lastName.size}")
	private String lastName;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	  public boolean equals(Object that) {
	    return EqualsBuilder.reflectionEquals(this, that);
	  }
	  
	  @Override
	  public int hashCode() {
	    return HashCodeBuilder.reflectionHashCode(this);
	  }

	@Override
	public String toString() {
		return "Spitter [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
	  
}
