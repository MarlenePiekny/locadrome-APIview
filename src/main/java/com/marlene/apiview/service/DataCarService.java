package com.marlene.apiview.service;

import com.marlene.apiview.model.Car;

import java.util.List;

public interface DataCarService {

    public List<Car> findAll();
    public Car findById(int id);
    public Car create();
    public void save(Car car);
    public void update(Car car, int id);
    public void delete(int id);
}
