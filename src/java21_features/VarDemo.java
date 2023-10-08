package java21_features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VarDemo {
  public static void main(String... args) throws IOException {
    var inputStreamReader = new InputStreamReader(System.in);
    var bufferedReader = new BufferedReader(inputStreamReader);
    var names = new ArrayList<String>();
    var num = 9;
    var pi = 3.14f;
    names.add(bufferedReader.readLine());
    names.add(bufferedReader.readLine());
    System.out.println(names);
  }
}