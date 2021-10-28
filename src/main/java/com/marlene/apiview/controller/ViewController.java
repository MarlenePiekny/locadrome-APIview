package com.marlene.apiview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    //DISPLAY HOME PAGE URI : /
    @GetMapping(value = {"/", "/home"})
    public String welcome() {
        return "index";
    }

//    //DISPLAY ALL CARS URI : /cars
//    @GetMapping(value = "/cars")
//    public String listCars(Model model) {
//        model.addAttribute("cars", "localhost:8081/cars");
//        return "carList";
//    }
//    //DISPLAY ONE CAR URI : /cars/{id}
//    @GetMapping(value = "/cars/{id}")
//    public String displayCar(Model model, @PathVariable int id) {
//        model.addAttribute("car", carDao.findById(id));
//        return "car";
//    }
//    //DISPLAY ADD CAR FORM URI : /cars/add
//    @GetMapping(value = "/addCar")
//    public String showAddCar(Model model) {
//        model.addAttribute("car", carDao.create());
//        return "addCar";
//    }
//    //SAVE CAR URI : /cars/add
//    @PostMapping(value = "/addCar")
//    public String saveCar(Model model, //
//                          @ModelAttribute("car") Car car) {
//        carDao.save(car);
//        return "redirect:/cars";
//    }
//
//    //DELETE CAR URI : /cars/{id}
//    @GetMapping(value = "deleteCar/{id}")
//    public String deleteCar(Model model, @PathVariable int id) {
//        carDao.delete(id);
//        return "redirect:/";
//    }
}
