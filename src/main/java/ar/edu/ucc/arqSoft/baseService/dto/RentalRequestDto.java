package ar.edu.ucc.arqSoft.baseService.dto;
import java.sql.Date;

import ar.edu.ucc.arqSoft.baseService.model.Member;
import ar.edu.ucc.arqSoft.baseService.model.Movie;
import ar.edu.ucc.arqSoft.common.dto.DtoEntity;


public class RentalRequestDto implements DtoEntity{
	
	private Long movieId;
	
	private Long memberId;

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	} 
	

}
