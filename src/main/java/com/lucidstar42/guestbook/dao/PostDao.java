package com.lucidstar42.guestbook.dao;

import java.util.List;

import com.lucidstar42.guestbook.vo.Post;

public interface PostDao {
	List<Post> selectList() throws Exception;
	int testInsert(Post post) throws Exception;
}