package ar.edu.ucc.arqSoft.baseService.dto;
import java.util.Set;

import ar.edu.ucc.arqSoft.baseService.model.Genre;
import ar.edu.ucc.arqSoft.baseService.model.Rental;
import ar.edu.ucc.arqSoft.common.dto.DtoEntity;

public class MovieRequestDto implements DtoEntity{

	private String title;

	private String synopsis;

	private int year;

	private Genre genre;
	
	private Set<Rental> rentals;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Set<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}
	
}
