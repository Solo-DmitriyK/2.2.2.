package web.servise;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServise {
    List<Car> car;

    {
        car = new ArrayList<>();
        car.add(new Car("Ford", "Fiesta", 3));
        car.add(new Car("Mitsubishi", "Pajero", 5));
        car.add(new Car("Toyota", "RAV4", 7));
        car.add(new Car("JEEP", "Wrangler", 9));
        car.add(new Car("E-mobile", "E-crossover", 15));
    }

    public List<Car> list(Integer value) {

        return value == null || value > car.size() ? car : car.subList(0, value);
    }

    public int index() {
        return car.size();
    }

}
