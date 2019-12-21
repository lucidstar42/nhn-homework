package com.lucidstar42.guestbook.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lucidstar42.guestbook.vo.Post;

@Repository
public class MySqlPostDao implements PostDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "com.lucidstar42.guestbook.dao.PostDao";
	
	@Override
	public int testInsert(Post post) throws Exception {
		int count = sqlSession.insert(namespace + ".testInsert", post);
		return count;
	}
}
