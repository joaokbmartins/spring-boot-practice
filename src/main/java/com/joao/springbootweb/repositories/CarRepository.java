package com.joao.springbootweb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.joao.springbootweb.models.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

	public List<Car> findByModel(String model);

	@Query("FROM cars WHERE brand = ?1 ORDER BY brand DESC")
	public List<Car> findByBrandDesc(String brand);

}
