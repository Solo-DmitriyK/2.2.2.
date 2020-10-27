package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.CarServise;

import java.util.List;

@Controller
public class CarController {

    private final CarServise carServise;

    @Autowired
    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping(value = "/numberOfCars")
        public String index(Model model){
        model.addAttribute("car", carServise.index());
        return "car/index";
    }

    @GetMapping(value = "/cars")
    public String listCars(@RequestParam(value = "count", required = false) Integer value,
            Model model){

        model.addAttribute("car", carServise.list(value));
        return "car/cars";
    }

}
