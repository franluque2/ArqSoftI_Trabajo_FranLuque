package ar.edu.ucc.arqSoft.baseService.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Movie;
import ar.edu.ucc.arqSoft.common.dao.GenericDao;

@Repository
public interface MovieDao extends GenericDao<Movie, Long> {
	public List<Movie> FindByName (String name);
}
