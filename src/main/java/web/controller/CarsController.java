package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarServiceImpl;
import web.models.Car;

import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String show(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        CarServiceImpl carServiceImpl = new CarServiceImpl();
        List<Car> list = carServiceImpl.getAllCars(count);
        model.addAttribute("car", list);
        return "cars";
    }
}
