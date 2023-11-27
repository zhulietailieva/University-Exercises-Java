package EX2;

import java.util.Arrays;

public class StartUp {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Toyota", "Camry", "Blue", 200, "Petrol", "Automatic", 2022),
                new Car("Lexus", "IS 500", "Red", 472, "Petrol", "Automatic", 2021),
                new Car("Ford", "Focus", "Silver", 190, "Petrol", "Automatic", 2020),
                new Car("Porsche", "911 Turbo S", "Black", 630, "Petrol", "Automatic", 2022),
        };


        char filterLetter = 'T';
        Car[] filteredCars = Car.filterByBrand(cars, filterLetter);
        System.out.println("Cars with brand starting with letter '" + filterLetter);
        for (Car car : filteredCars) {
            System.out.println(car.getBrand());
        }


        Car[] sortedCarsAsc = Car.sortByBrand(cars.clone(), true);
        System.out.println("Cars sorted by brand in asc order:");
        for (Car car : sortedCarsAsc) {
            System.out.println(car.getBrand());
        }


        Car[] sortedCarsDesc = Car.sortByBrand(cars.clone(), false);
        System.out.println("Cars sorted by brand in desc order:");
        for (Car car : sortedCarsDesc) {
            System.out.println(car.getBrand());
        }


        Car[] duplicateCars = {
                new Car("Toyota", "Camry", "Blue", 200, "Petrol", "Automatic", 2022),
                new Car("Lexus", "IS 500", "Red", 472, "Petrol", "Automatic", 2021),
                new Car("Ford", "Focus", "Silver", 190, "Petrol", "Automatic", 2020),
                new Car("Porsche", "911 Turbo S", "Black", 630, "Petrol", "Automatic", 2022),
                new Car("Porsche", "911 Turbo S", "Black", 630, "Petrol", "Automatic", 2022),
        };

        Car[] uniqueCars = Car.removeDuplicateCars(cars);
        System.out.println("Unique cars after removing duplicates:");
        for (Car car : uniqueCars) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }

    }
}
