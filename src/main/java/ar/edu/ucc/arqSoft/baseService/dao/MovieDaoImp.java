package ar.edu.ucc.arqSoft.baseService.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Movie;
import ar.edu.ucc.arqSoft.common.dao.GenericDaoImp;

@Repository
public class MovieDaoImp extends GenericDaoImp<Movie, Long> implements MovieDao{

	public List<Movie> FindByName(String name) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Movie> criteria = builder.createQuery(Movie.class);
        Root<Movie> entity = criteria.from(Movie.class);

        criteria.select(entity).where(builder.equal(entity.get("TITLE"), name));
        return em.createQuery(criteria).getResultList();
	}

}
