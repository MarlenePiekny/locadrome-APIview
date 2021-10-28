package com.marlene.apiview.controller;

import com.marlene.apiview.model.Car;
import com.marlene.apiview.service.DataCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {

    @Autowired
    private DataCarService dataCarService;

    //DISPLAY HOME PAGE URI : /
    @GetMapping(value = {"/", "/home"})
    public String welcome() {
        return "index";
    }

    //DISPLAY ALL CARS URI : /cars
    @GetMapping(value = "/cars")
    public String listCars(Model model) {
        model.addAttribute("cars", dataCarService.findAll());
        return "carList";
    }

    //DISPLAY ONE CAR URI : /cars/{id}
    @GetMapping(value = "/cars/{id}")
    public String displayCar(Model model, @PathVariable int id) {
        model.addAttribute("car", dataCarService.findById(id));
        return "car";
    }

    //DISPLAY ADD CAR FORM URI : /cars/add
    @GetMapping(value = "/addCar")
    public String showAddCar(Model model) {
        model.addAttribute("car", dataCarService.create());
        return "addCar";
    }

    //SAVE CAR URI : /cars/add
    @PostMapping(value = "/addCar")
    public String saveCar(Model model, //
                          @ModelAttribute("car") Car car) {
        dataCarService.save(car);
        return "redirect:/cars";
    }

    //DELETE CAR URI : /cars/{id}
    @GetMapping(value = "deleteCar/{id}")
    public String deleteCar(Model model, @PathVariable int id) {
        dataCarService.delete(id);
        return "redirect:/";
    }
}
