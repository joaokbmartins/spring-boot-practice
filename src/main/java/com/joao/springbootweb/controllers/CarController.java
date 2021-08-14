package com.joao.springbootweb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.joao.springbootweb.models.Car;
import com.joao.springbootweb.repositories.CarRepository;

@Controller
public class CarController {

	@Autowired
	CarRepository carRepo;

	@RequestMapping("/home")
	public ModelAndView home() {
		Iterable<Car> cars = this.carRepo.findAll();
		System.out.println("Home called");
		ModelAndView mv = new ModelAndView();
		mv.addObject("carList", cars);
		mv.setViewName("home");
		return mv;
//		return this.home();
	}

	@RequestMapping("/addCar")
	public ModelAndView addCar(Car car) {
		if (car != null && car.getId() > 0) {
			this.carRepo.save(car);
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/update")
	public ModelAndView update() {
		ModelAndView mv = new ModelAndView("car-update");
		return mv;
	}

	@RequestMapping("/updateCar")
	public ModelAndView updateCar(Car car) {
		Car updatedCar = this.carRepo.save(car);
		ModelAndView mv = new ModelAndView("car-details");
		mv.addObject("car", updatedCar);
		return mv;
	}

	@RequestMapping("/getCar")
	public ModelAndView getCar(@RequestParam int id) {
		Optional<Car> car = this.carRepo.findById(id);
		System.out.println("Car: " + car);
		System.out.println("CAR: " + car.get());
		ModelAndView mv = new ModelAndView();
		mv.addObject("car", car.get());
		mv.setViewName("car-details");
		return mv;
	}

	@RequestMapping("/carsByModel")
	public String getCarsByModel(@RequestParam String model) {
		List<Car> cars = this.carRepo.findByModel(model);
		System.out.println("CArs: " + cars);
		return "home";
	}

	@RequestMapping("/carsByBrandDesc")
	public String getCarsByBrnadDesc(@RequestParam String brand) {
		List<Car> cars = this.carRepo.findByBrandDesc(brand);
		System.out.println("CARS: " + cars);
		return "home";
	}

	@RequestMapping("/delete")
	public ModelAndView deletePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");
		return mv;
	}

	@RequestMapping("/deleteCar")
	public ModelAndView deleteCar(Car car) {
		this.carRepo.delete(car);
		System.out.println("Deleting: " + car);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

}
