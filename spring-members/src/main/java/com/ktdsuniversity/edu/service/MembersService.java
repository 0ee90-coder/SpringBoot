package com.ktdsuniversity.edu.service;

import com.ktdsuniversity.edu.vo.response.MemberListVO;

public interface MembersService {
	
	/**
	 * 게시글의 목록을 조회.
	 * @return (게시글 개수, 게시글 목록) 
	 */
	
	MemberListVO readAllMembers();

}
