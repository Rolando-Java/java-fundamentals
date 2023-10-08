package java21_features;

public class SwitchDemo {
  public static void main(String... args) {
    String day = "Wed";
    String time = "";
    // in the expression you put a semicolon at the end
    time = switch (day) {
      case "Sat", "Sun" -> "6am";
      case "Wed" -> {
        int n = 5;
        yield "8am" + n;
      }
      default -> "7am";
    };
    System.out.println("time = " + time);
  }
}
