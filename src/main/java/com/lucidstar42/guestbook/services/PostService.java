package com.lucidstar42.guestbook.services;

import java.util.List;

import com.lucidstar42.guestbook.vo.Post;

public interface PostService {
	List<Post> listAll() throws Exception;
	void addPost(Post post) throws Exception;
}
