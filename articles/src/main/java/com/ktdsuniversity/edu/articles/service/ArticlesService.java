package com.ktdsuniversity.edu.articles.service;

import com.ktdsuniversity.edu.articles.vo.request.ModifyArticleVO;
import com.ktdsuniversity.edu.articles.vo.request.RegistArticleVO;
import com.ktdsuniversity.edu.articles.vo.response.ArticleListVO;
import com.ktdsuniversity.edu.articles.vo.response.ArticlesVO;

public interface ArticlesService {
	
	/**
	 * 게시글의 목록을 조회.
	 * @return (게시글 개수, 게시글 목록) 
	 */
	
	ArticleListVO readAllArticles();
	
	/**
	 * 게시글 생성
	 * @parm registArticleVO 클라이언트 보내 줌과 동시에 */
	
	ArticlesVO createNewArticle(RegistArticleVO registArticleVO);
	
	/**
	 * 게시글 수정
	 * @parm articleId 수정하려는 게시글의 아이디
	 * @parm modifyArticleVO 수정하려는 내용
	 * @return 수정된 결과
	 */
	ArticlesVO updateArticle(String articleId, ModifyArticleVO modifyArticleVO);

	ArticlesVO deleteArticle(String articleId);
}
