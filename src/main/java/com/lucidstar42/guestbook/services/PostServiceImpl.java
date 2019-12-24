package com.lucidstar42.guestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucidstar42.guestbook.dao.PostDao;
import com.lucidstar42.guestbook.vo.Post;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDao dao;
	
	@Override
	public List<Post> listAll() throws Exception {
		return dao.selectList();
	}

	@Override
	public void addPost(Post post) throws Exception {
		dao.insertPost(post);
	}

	@Override
	public Post getPostById(int id) throws Exception {
		return dao.selectOne(id);
	}

	@Override
	public void editPost(Post post) throws Exception {
		dao.updatePost(post);
	}
}
