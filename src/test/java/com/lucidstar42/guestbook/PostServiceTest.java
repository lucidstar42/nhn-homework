package com.lucidstar42.guestbook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lucidstar42.guestbook.services.PostService;
import com.lucidstar42.guestbook.vo.Post;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class PostServiceTest {
	
	@Autowired
	private PostService service;

	@Test
	public void testAddPost() {
		try {
			Post post = new Post().setEmail("aaaa@bbb.ccc").setPassword("abcd1234").setContent("Test Content!");
			service.addPost(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testListAll() {
		try {
			service.listAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetPostById() {
		try {
			service.getPostById(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEditPost() {
		try {
			Post post = new Post().setId(1).setPassword("abcd1234").setContent("Editted Content!!!");
			service.editPost(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
