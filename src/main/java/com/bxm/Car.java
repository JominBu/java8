package com.bxm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by buxiaoming on 2017/4/5.
 */
public class Car {

    public static void main(String[] args) {
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);

        cars.forEach(Car::collide);
        cars.forEach(Car::repair);
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }

    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car car) {
        System.out.println("Following the " + car.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }
}
