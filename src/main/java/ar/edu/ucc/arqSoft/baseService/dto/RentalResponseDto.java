package ar.edu.ucc.arqSoft.baseService.dto;
import java.sql.Date;

import ar.edu.ucc.arqSoft.baseService.model.Member;
import ar.edu.ucc.arqSoft.baseService.model.Movie;
import ar.edu.ucc.arqSoft.common.dto.DtoEntity;


public class RentalResponseDto implements DtoEntity{
	private Date date;
	
	private String lastName;
	
	private String title;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
