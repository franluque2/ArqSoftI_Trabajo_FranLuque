package ar.edu.ucc.arqSoft.baseService.model;


import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import ar.edu.ucc.arqSoft.common.model.GenericObject;

@Entity
@Table(name="MOVIE")
public class Movie extends GenericObject{
	@NotNull
	@Size(min=1, max=250)
	@Column (name="TITLE")
	private String title;

	@Size(min=1, max=4000)
	@Column (name="SYNOPSIS")
	private String synopsis;

	@Size(min=1, max=4)
	@Column (name="YEAR")
	private int year;

	@Enumerated(value= EnumType.ORDINAL)
	@Column (name="GENRE")
	private Genre genre;
	
	@OneToMany(mappedBy="movie", fetch=FetchType.LAZY)
	private Set<Rental> rentals;
	
	public Set<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(Set<Rental> rentals) {
		this.rentals = rentals;
	}

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
	
	
}
