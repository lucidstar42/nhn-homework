package com.lucidstar42.guestbook.controls;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
		Pattern p = Pattern.compile(".+@.+[.].+");
		
		if(post.getEmail().isEmpty()) {
			model.addAttribute("code", "001");
			return "Error";
		}
		
		if(!p.matcher(post.getEmail()).find()) {
			model.addAttribute("code", "002");
			return "Error";
		}
		
		if(post.getPassword().isEmpty()) {
			model.addAttribute("code", "003");
			return "Error";
		}
		
		if(post.getContent().isEmpty()) {
			model.addAttribute("code", "004");
			return "Error";
		}
		
		service.addPost(post);
		return "redirect:/guestbook";
	}
	
	@RequestMapping(value="/guestbook/edit/{postId}", method=RequestMethod.GET)
	public String editPostGET(@PathVariable("postId") int postId, Model model) throws Exception {
		model.addAttribute("post", service.getPostById(postId));
		return "EditPost";
	}
	
	@RequestMapping(value="/guestbook/edit", method=RequestMethod.POST)
	public String editPostPOST(Post post) throws Exception {
		service.editPost(post);
		return "redirect:/guestbook";
	}
}
