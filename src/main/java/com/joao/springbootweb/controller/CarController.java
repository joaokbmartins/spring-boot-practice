package com.joao.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.joao.springbootweb.model.Car;

@Controller
public class CarController {

	@RequestMapping("home")
	public ModelAndView home() {
		System.out.println("Home called");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
//		return this.home();
	}

	@RequestMapping("addCar")
	public ModelAndView addCar(Car car) {
		System.out.println("Car: " + car);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

}
