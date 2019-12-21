package com.lucidstar42.guestbook.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lucidstar42.guestbook.vo.Post;

public class MysSqlPostDao implements PostDao {
	SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public int testInsert(Post post) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int count = sqlSession.insert("com.lucidstar42.guestbook.PostDao.testInsert", post);
			sqlSession.commit();
			return count;
		} finally {
			sqlSession.close();
		}
	}
}
