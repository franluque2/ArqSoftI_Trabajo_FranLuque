package ar.edu.ucc.arqSoft.baseService.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ar.edu.ucc.arqSoft.common.model.GenericObject;

@Entity
@Table(name="RENTAL")
public class Rental extends GenericObject {
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="MOVIE_ID")
	private Movie movie; 
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="MEMBER_ID")
	private Member member; 
	
	@NotNull
	@Column(name= "FECHA")
	private Date date;

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
