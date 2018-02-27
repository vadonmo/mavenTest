package com.vadon.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vadon.model.User;
import com.vadon.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/showname/{uid}", method = RequestMethod.GET)
	public String showUserName(@PathVariable("uid") Integer uid, HttpServletRequest request, Model model) {
		System.out.println("showname");
		if (uid != null) {
			User user = userService.getUserAllBlog(uid);
			if (user != null) {
				request.setAttribute("name", user);
				user = userService.getUserById(uid);
				model.addAttribute("name1", user);
				return "showName";
			}
		}
		request.setAttribute("error", "没有找到该用户！");
		return "error";
	}
}
