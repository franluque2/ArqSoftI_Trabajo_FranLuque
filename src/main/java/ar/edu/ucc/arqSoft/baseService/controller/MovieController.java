package ar.edu.ucc.arqSoft.baseService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.ucc.arqSoft.baseService.dto.MovieResponseDto;
import ar.edu.ucc.arqSoft.baseService.service.MovieService;


@Controller
@RequestMapping("/movie")
public class MovieController {
	@Autowired
    private MovieService movieService;
	
	@RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<MovieResponseDto> getAllMovies()
    {
        return movieService.getAllMovies();
    }
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody MovieResponseDto lookupMovieById(@PathVariable("id") Long id)
    {
        return movieService.getMovieById(id);
    }
	
	

}
