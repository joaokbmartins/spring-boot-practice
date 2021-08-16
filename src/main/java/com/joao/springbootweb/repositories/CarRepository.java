package com.joao.springbootweb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.joao.springbootweb.models.Car;

/**
 * 
 * @Feature: @RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
 * 				Could be used to skip creation of a basic RestController class.
 *
 */
public interface CarRepository extends JpaRepository<Car, Integer> {

	public List<Car> findByModel(String model);

	@Query("FROM Car WHERE brand = ?1 ORDER BY brand DESC")
	public List<Car> findByBrandDesc(String brand);

}
