package com.lucidstar42.guestbook.dao;

import java.util.List;

import com.lucidstar42.guestbook.vo.Post;

public interface PostDao {
	int testInsert(Post post) throws Exception;
	List<Post> selectList() throws Exception;
	void insertPost(Post post) throws Exception;
	Post selectOne(int id) throws Exception;
	void updatePost(Post post) throws Exception;
}