package com.ktdsuniversity.edu.vo.response;

import java.util.List;

public class MemberListVO {
	
	/**
	 * 검색된 게시글의 총 개수
	 * */
	private long memberCount;
	
	/**
	 * 검색된 게시글의 목록
	 */
	
	private List<MembersVO> memberList;

	public long getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(long memberCount) {
		this.memberCount = memberCount;
	}

	public List<MembersVO> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<MembersVO> memberList) {
		this.memberList = memberList;
	}

}
