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
	
}
