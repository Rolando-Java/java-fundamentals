package java21_features;

public class StringTemplateDemo {

  public static void main(String... args) {
    String name = "sue";
    String message = "";
    message = "Greetings " + name;
    System.out.println("message = " + message);
    message = String.format("Greetings %s", name);
    System.out.println("message = " + message);

    // using template strings
    message = STR. "Greetings \{ name }" ;
    System.out.println("message = " + message);

    int i = 9;
    int j = 8;
    String result = STR. "\{ i } + \{ j } = \{ i + j }" ;
    System.out.println("result = " + result);

    var age = 13;
    // using template string with text block
    var jsonValue = STR."""
          {
            "name" : "\{name}",
            "age" : \{age}
          }
        """;
    String jsonResult = STR."The json result is \{jsonValue}";
    System.out.println("jsonResult = " + jsonResult);
  }
}


