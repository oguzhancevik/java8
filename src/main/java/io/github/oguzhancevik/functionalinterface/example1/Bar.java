package io.github.oguzhancevik.functionalinterface.example1;

public class Bar {

  public int calculate(Foo foo, int x, int y){
    return foo.apply(x, y);
  }

}
