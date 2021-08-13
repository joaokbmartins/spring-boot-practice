package com.joao.springbootweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.joao.springbootweb.model.Car;
import com.joao.springbootweb.repository.CarRepository;

@Controller
public class CarController {

	@Autowired
	CarRepository carRepo;

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
		if (car != null && car.getId() > 0) {
			this.carRepo.save(car);
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("delete")
	public ModelAndView deletePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");
		return mv;
	}

	@RequestMapping("deleteCar")
	public ModelAndView deleteCar(Car car) {

		try {
			this.carRepo.delete(car);
		} catch (Exception ex) {
			System.err.println("Error: " + ex);
		}
		System.out.println("Deleting: " + car);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

}
