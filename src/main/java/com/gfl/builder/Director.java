package com.gfl.builder;

public class Director {
  
  public MyProduct getMyproduct(){
    MyProduct.Builder builder = MyProduct.getBuilder();
    builder.setProp1("one");
    builder.setProp2("two");
    return builder.build();
  }

  public static void main(String[] args){
    System.out.println( new Director().getMyproduct());
  }

}
