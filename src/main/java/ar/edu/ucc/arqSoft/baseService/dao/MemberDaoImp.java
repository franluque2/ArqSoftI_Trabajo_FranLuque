package ar.edu.ucc.arqSoft.baseService.dao;

import org.springframework.stereotype.Repository;

import ar.edu.ucc.arqSoft.baseService.model.Member;
import ar.edu.ucc.arqSoft.common.dao.GenericDaoImp;

@Repository
public class MemberDaoImp extends GenericDaoImp<Member, Long> implements MemberDao{

}
