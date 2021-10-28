package com.marlene.apiview.service;

import com.marlene.apiview.model.Car;
import com.marlene.apiview.model.CarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DataCarImplServIce implements DataCarService{

    @Autowired
    private RestTemplate restTemplate;
    private String baseURL = "http://localhost:8081";

    @Override
    public List<Car> findAll() {
        return restTemplate.getForObject(baseURL + "/cars", CarList.class).getCarList();
    }

    @Override
    public Car findById(int id) {
        return restTemplate.getForObject(baseURL +"/cars/" + id , Car.class);
    }

    @Override
    public Car create() {
        return new Car();
    }

    @Override
    public void save(Car car) {
        restTemplate.postForObject(baseURL +"/cars", car, Car.class);
    }

    @Override
    public void update(Car car, int id) {
        restTemplate.put(baseURL +"/cars/" + id, car, Car.class);
    }

    @Override
    public void delete(int id) {
        restTemplate.delete(baseURL + "/cars/" + id, Car.class);
    }
}
