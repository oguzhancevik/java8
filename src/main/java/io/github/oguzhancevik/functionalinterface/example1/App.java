package io.github.oguzhancevik.functionalinterface.example1;

public class App {

  public static void main(String[] args) {
    Foo foo = ((x, y) -> (2 * x + y));
    int result = foo.apply(3, 4);
    System.out.println("Result1 = " + result);

    foo = ((x, y) -> (int) Math.pow(x, y));
    result = foo.apply(3, 2);
    System.out.println("Result2 = " + result);
  }
}
