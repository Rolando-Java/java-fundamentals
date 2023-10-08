package java21_features;

public class TextBlockDemo {
  public static void main(String... args) {
    String htmlData = """
          <html>
            <body>
              <div>
                Hola mundo
              </div>
            </body>
          </html>
        """;
    System.out.println(htmlData);
  }
}
