package com.joao.springbootweb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("home")
	public String index(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String type = (String) request.getParameter	("type");
		System.out.println("Type: " + type);
		session.setAttribute("type", type);
		return "index";
	}

}
