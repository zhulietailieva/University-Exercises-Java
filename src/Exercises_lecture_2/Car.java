package EX2;
import java.util.Arrays;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int power;
    private String engineType;
    private String transmissionType;
    private int yearOfProduction;


    public Car(){}
    public Car(String brand, String model, String color, int power, String engineType, String transmissionType, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
        this.yearOfProduction = yearOfProduction;

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public static Car[] filterByBrand(Car[] cars, char letter) {
        return Arrays.stream(cars).filter(car -> car.getBrand().toUpperCase().charAt(0) == Character.toUpperCase(letter)).toArray(Car[]::new);

    }

    public static Car[] sortByBrand(Car[] cars, boolean ascending) {
        Arrays.sort(cars, (car1, car2) -> {
            if (ascending) {
                return car1.getBrand().compareTo(car2.getBrand());
            }
            else
                return car2.getBrand().compareTo(car1.getBrand());

        });
        return cars;
    }

    public static Car[] removeDuplicateCars(Car[] cars) {
        int n = cars.length;
        int uniqueCount = 0;
        boolean[] isDuplicate = new boolean[n];


        for (int i = 0; i < n; i++) {
            if (!isDuplicate[i]) {
                for (int j = i + 1; j < n; j++) {
                    if (cars[i].equals(cars[j])) {
                        isDuplicate[j] = true;
                    }
                }
                uniqueCount++;
            }
        }


        Car[] uniqueCars = new Car[uniqueCount];
        int index = 0;


        for (int i = 0; i < n; i++) {
            if (!isDuplicate[i]) {
                uniqueCars[index] = cars[i];
                index++;
            }
        }

        return uniqueCars;
    }

}
