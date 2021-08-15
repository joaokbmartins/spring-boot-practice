package com.joao.springbootweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joao.springbootweb.repositories.CarRepository;

@Controller
public class CarRestController {

	@Autowired
	private CarRepository carRepository;

	@RequestMapping("/cars")
	@ResponseBody
	public String findCars() {
		return this.carRepository.findAll().toString();
	}

	@RequestMapping("/car/{id}")
	@ResponseBody
	public String findCarById(@PathVariable("id") int id) {
		return this.carRepository.findById(id).toString();
	}
}
