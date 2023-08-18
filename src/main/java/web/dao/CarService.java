package web.dao;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars(Integer count);
}
