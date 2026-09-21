package com.ktdsuniversity.edu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.dao.MembersDao;
import com.ktdsuniversity.edu.vo.response.MemberListVO;
import com.ktdsuniversity.edu.vo.response.MembersVO;


	
@Service
public class MembersServicempl implements MembersService{
	
	private MembersDao membersDao;
	public MembersServicempl(MembersDao membersDao) {
	this.membersDao = membersDao;	
	}
	@Override
	public MemberListVO readAllMembers() {
		long count = this.membersDao.selectMembersCount();
		List<MembersVO> memberList = this.membersDao.selectAllMembers();
		
		MemberListVO list = new MemberListVO();
		list.setMemberCount(count);
		list.setMemberList(memberList);
		return list;
	}
}
