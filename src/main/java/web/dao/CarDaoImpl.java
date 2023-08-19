package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars(Integer count) {
        List<Car> cars;
        {
            cars = new ArrayList<>();

            cars.add(new Car(1, "BMW", "GT 535D"));
            cars.add(new Car(2, "TESLA", "Model S"));
            cars.add(new Car(3, "AUDI", "RS6"));
            cars.add(new Car(4, "DODGE", "RAM"));
            cars.add(new Car(5, "RANGE ROVER", "Velar"));
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
