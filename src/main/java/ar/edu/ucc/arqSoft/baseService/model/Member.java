package ar.edu.ucc.arqSoft.baseService.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;

@Entity
@Table(name="MEMBER")
public class Member extends GenericObject {
	@NotNull
	@Size(min=1, max=250)
	@Column (name="NAME")
	private String name;
	
	@NotNull
	@Size(min=1, max=250)
	@Column (name="LAST_NAME")
	private String lastname;
	
	@NotNull
	@Size(min=1, max=16)
	@Column (name="DNI")
	private String dni;  //Lo dejo como string por si acaso empieza con una letra
	
	@NotNull
	@Size(min=1, max=250)
	@Column (name="EMAIL")
	private String email;
	
	@OneToMany(mappedBy="member", fetch=FetchType.LAZY)
	private Set<Rental> rentals;
	
	public Set<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
