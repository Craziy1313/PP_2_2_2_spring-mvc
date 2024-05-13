package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarsServise;


@Controller
public class CarsController {

    @Autowired
    private CarsServise carsServise;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (value = "count", required = false) Integer count, Model model) {
        model.addAttribute("count", carsServise.getCars(count));
        return "cars";
    }
}
