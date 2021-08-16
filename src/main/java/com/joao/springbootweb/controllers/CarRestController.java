package com.joao.springbootweb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.joao.springbootweb.models.Car;
import com.joao.springbootweb.repositories.CarRepository;

@Controller
public class CarRestController {

	@Autowired
	private CarRepository carRepository;

	@RequestMapping(path = "/cars", produces = { "application/xml" })
	@ResponseBody
	public List<Car> findCars() {
		return this.carRepository.findAll();
	}

	@RequestMapping("/car/{id}")
	@ResponseBody
	public Optional<Car> findCarById(@PathVariable("id") int id) {
		return this.carRepository.findById(id);
	}

	@RequestMapping("/cars/add")
	@ResponseBody
	public List<Car> addCar(@RequestBody Car car) {
		this.carRepository.save(car);
		return this.carRepository.findAll();
	}
}
