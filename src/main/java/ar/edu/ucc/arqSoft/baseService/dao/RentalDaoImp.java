package ar.edu.ucc.arqSoft.baseService.dao;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Rental;
import ar.edu.ucc.arqSoft.common.dao.GenericDaoImp;

@Repository
public class RentalDaoImp extends GenericDaoImp<Rental, Long> implements RentalDao{

}
