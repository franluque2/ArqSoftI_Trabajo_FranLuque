package ar.edu.ucc.arqSoft.baseService.dao;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Rental;
import ar.edu.ucc.arqSoft.common.dao.GenericDao;

@Repository
public interface RentalDao extends GenericDao<Rental, Long> {

}
