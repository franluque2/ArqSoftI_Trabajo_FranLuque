package ar.edu.ucc.arqSoft.baseService.dao;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Member;
import ar.edu.ucc.arqSoft.common.dao.GenericDao;

@Repository
public interface MemberDao extends GenericDao<Member, Long> {

}
