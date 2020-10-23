package ar.edu.ucc.arqSoft.baseService.service;

import java.sql.Date;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.MemberDao;
import ar.edu.ucc.arqSoft.baseService.dao.MovieDao;
import ar.edu.ucc.arqSoft.baseService.dao.RentalDao;
import ar.edu.ucc.arqSoft.baseService.dto.RentalRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.RentalResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Rental;
import ar.edu.ucc.arqSoft.common.dto.ModelDtoConverter;

@Service
@Transactional
public class RentalService {

	@Autowired
	private RentalDao rentalDao;

	@Autowired
	private MovieDao movieDao;

	@Autowired
	private MemberDao memberDao;

	public RentalResponseDto insertRental(RentalRequestDto request) {

		Rental rental = new Rental();

		rental.setDate((Date) Calendar.getInstance().getTime());
		rental.setMovie(movieDao.load(request.getMovieId()));
		rental.setMember(memberDao.load(request.getMemberId()));

		rentalDao.insert(rental);

		RentalResponseDto response = new RentalResponseDto();

		response.setLastName(rental.getMember().getLastname());
		response.setDate(rental.getDate());
		response.setTitle(rental.getMovie().getTitle());

		return response;
	}
}
