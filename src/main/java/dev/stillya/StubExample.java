package dev.stillya;

import java.util.List;

public class StubExample {

  public String testEnterd(List<String> l) {
    l.add("Hello world!");
    System.out.println("Hello world!");
    int a = 1;
    int b = 2;
    int c = a + b;
    return "Hello world! " + c;
  }

}
