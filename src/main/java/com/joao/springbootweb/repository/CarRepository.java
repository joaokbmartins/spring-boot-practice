package com.joao.springbootweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.joao.springbootweb.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
