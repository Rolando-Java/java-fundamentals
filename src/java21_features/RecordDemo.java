package java21_features;

import java.util.Objects;

/*
class Alien {
  private int age;
  private String name;

  public Alien(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alien alien = (Alien) o;
    return age == alien.age && Objects.equals(name, alien.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public String toString() {
    return "Alien{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}
*/

record Alien(Integer age, String name) {
  public Alien(String name) {
    this(null, name);
  }
}

public class RecordDemo {
  public static void main(String... args) {
    Alien alien = new Alien(33, "Navin");
    Alien alien2 = new Alien(33, "Navin");
    System.out.println("alien = " + alien);
    System.out.println(alien.equals(alien2));

    Alien alien3 = new Alien("Sue");
    Alien alien4 = new Alien("Sue");
    System.out.println(alien3.equals(alien4));
  }
}
