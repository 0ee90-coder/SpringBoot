package com.ktdsuniversity.edu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ktdsuniversity.edu.vo.response.MembersVO;

@Mapper
public interface MembersDao {
	
	/**
	 * 게시글의 총 개수를 반환
	 * @return
	 */
	
	long selectMembersCount();

	/**
	 *게시글을 검색해서 반환
	 *@return
	 */
	List<MembersVO> selectAllMembers();

}
