package com.lucidstar42.guestbook;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lucidstar42.guestbook.dao.MySqlPostDao;
import com.lucidstar42.guestbook.vo.Post;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class testDao {
	
	@Autowired
	private MySqlPostDao postDao;

	@Test
	public void testInsert() {
		try {
			Post post = new Post();
			
			postDao.testInsert(
				post.setEmail("bbb@bbb.ccc")
					.setPassword("abcdefg")
					.setContent("Test Content222!!!")
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSelectList() {
		try {
			for(Post post : postDao.selectList()) {
				System.out.println(post.getId() + " " + post.getContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
