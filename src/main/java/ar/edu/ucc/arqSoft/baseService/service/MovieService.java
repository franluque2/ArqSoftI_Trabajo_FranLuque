package ar.edu.ucc.arqSoft.baseService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.MovieDao;
import ar.edu.ucc.arqSoft.baseService.dto.MovieResponseDto;
import ar.edu.ucc.arqSoft.baseService.dto.MovieRequestDto;
import ar.edu.ucc.arqSoft.baseService.model.Movie;
import ar.edu.ucc.arqSoft.common.dto.ModelDtoConverter;

@Service
@Transactional
public class MovieService {
	
	@Autowired
	private MovieDao movieDao;
	
	public MovieResponseDto getMovieById(Long id) {
		Movie movie = movieDao.load(id);
				
		MovieResponseDto response = (MovieResponseDto) new ModelDtoConverter().convertToDto(movie, new MovieResponseDto());	
		return response;
	}
	
	public List<MovieResponseDto> getAllMovies() {
		List<Movie> movies = movieDao.getAll();
		
		List<MovieResponseDto> response = new ArrayList<MovieResponseDto>();
		 
		for (Movie movie : movies) {
			response.add((MovieResponseDto) new ModelDtoConverter().convertToDto(movie, new MovieResponseDto()));
		}
		
		return response;
	}
	
	
	public MovieResponseDto insertMovie(MovieRequestDto request) {
		
		Movie movie = (Movie) new ModelDtoConverter().convertToEntity(new Movie(), request);
		
		movieDao.insert(movie);
		
		MovieResponseDto response = (MovieResponseDto) new ModelDtoConverter().convertToDto(movie, new MovieResponseDto());	
		
		return response;
	}
}
