package com.lucidstar42.guestbook.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lucidstar42.guestbook.services.PostService;
import com.lucidstar42.guestbook.vo.Post;

@Controller
public class PostController {
	
	@Autowired
	private PostService service;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() throws Exception {
		return "redirect:/guestbook";
	}
	
	@RequestMapping(value="/guestbook", method=RequestMethod.GET)
	public String listPost(Model model) throws Exception {
		model.addAttribute("posts", service.listAll());
		return "PostList";
	}
	
	@RequestMapping(value="/guestbook/add", method=RequestMethod.GET)
	public String addPostGET() throws Exception {
		return "AddPost";
	}
	
	@RequestMapping(value="/guestbook/add", method=RequestMethod.POST)
	public String addPostPOST(Post post, Model model) throws Exception {
		service.addPost(post);
		return "redirect:/guestbook";
	}
}
