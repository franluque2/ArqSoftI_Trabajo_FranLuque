package ar.edu.ucc.arqSoft.baseService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqSoft.baseService.dao.MemberDao;
import ar.edu.ucc.arqSoft.baseService.dto.MemberRequestDto;
import ar.edu.ucc.arqSoft.baseService.dto.MemberResponseDto;
import ar.edu.ucc.arqSoft.baseService.model.Member;
import ar.edu.ucc.arqSoft.common.dto.ModelDtoConverter;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	public MemberResponseDto insertMember(MemberRequestDto request) {
		
		Member member = new Member();
		
		member.setDni(request.getDni());
		member.setEmail(request.getEmail());
		member.setName(request.getName());
		member.setLastname(request.getLastname());
	
		memberDao.insert(member);
		
		MemberResponseDto response = new MemberResponseDto();
		
		response.setDni(member.getDni());
		response.setLastname(member.getLastname());
		response.setDni(member.getDni());
				
		return response;
	}

}
