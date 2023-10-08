package java21_features;

sealed class Vehicle permits Car, Bike {
  public void go() {
    System.out.println("Going");
  }
}

non-sealed class Car extends Vehicle {

}

final class Bike extends Vehicle {

}

class Nisan extends Car {

}

public class SealedDemo {
  public static void main(String... args) {
  }
}
