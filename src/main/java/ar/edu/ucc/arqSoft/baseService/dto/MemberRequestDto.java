package ar.edu.ucc.arqSoft.baseService.dto;

import java.util.Set;

import ar.edu.ucc.arqSoft.baseService.model.Rental;
import ar.edu.ucc.arqSoft.common.dto.DtoEntity;

public class MemberRequestDto implements DtoEntity {

	private String name;
	
	private String lastname;

	private String dni;
	
	private String email;
	
	private Set<Rental> rentals;

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

	public Set<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}
	
}
