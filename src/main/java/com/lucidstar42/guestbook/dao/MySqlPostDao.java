package com.lucidstar42.guestbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
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
	
	@Override
	public List<Post> selectList() throws Exception {
		return sqlSession.selectList(namespace + ".selectList");
	}

	@Override
	public void insertPost(Post post) throws Exception {
		sqlSession.insert(namespace + ".insertPost", post);
	}

	@Override
	public Post selectOne(int id) throws Exception {
		return sqlSession.selectOne(namespace + ".selectOne", id);
	}

	@Override
	public void updatePost(Post post) throws Exception {
		sqlSession.update(namespace + ".updatePost", post);
	}
}
