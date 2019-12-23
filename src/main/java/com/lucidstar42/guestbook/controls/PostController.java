package com.lucidstar42.guestbook.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lucidstar42.guestbook.services.PostService;

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
}