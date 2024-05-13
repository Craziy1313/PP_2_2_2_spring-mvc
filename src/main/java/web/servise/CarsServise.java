package web.servise;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarsServise {
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();

        cars.add(new Car(1, 1994, "Toyota"));
        cars.add(new Car(13, 2008, "Toyota"));
        cars.add(new Car(7, 1999, "BMW"));
        cars.add(new Car(15, 2023, "Mercedes"));
        cars.add(new Car(11, 2019, "Audi"));

    }

    public List<Car> getCars(Integer count) {
        if (count == null) {
            return cars;
        } else if (count > 0 && count < 5) {
            List<Car> extractedCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                extractedCars.add(cars.get(i));
            }
            return extractedCars;
        } else {
            return cars;
        }
    }
}
