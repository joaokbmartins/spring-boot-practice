package com.joao.springbootweb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joao.springbootweb.models.Car;
import com.joao.springbootweb.repositories.CarRepository;

@RestController
public class CarRestController {

	@Autowired
	private CarRepository carRepository;

	@GetMapping(path = "/cars", produces = { "application/xml" })
	public List<Car> findCars() {
		return this.carRepository.findAll();
	}

	@GetMapping("/car/{id}")
	public Optional<Car> findCarById(@PathVariable("id") int id) {
		return this.carRepository.findById(id);
	}

	@PostMapping("/car")
	public Car addCar(@RequestBody Car car) {
		try {
			return this.carRepository.save(car);
		} catch (Exception ex) {
			System.err.println(ex.getStackTrace());
			return null;
		}
	}

	@DeleteMapping("/car/delete")
	public void deleteCar(@RequestBody int id) {
		Car car = this.carRepository.findById(id).get();
		this.carRepository.delete(car);
	}

	@PutMapping("/car")
	public Car updateCar(@RequestBody Car car) {
		return this.carRepository.save(car);
	}

}
