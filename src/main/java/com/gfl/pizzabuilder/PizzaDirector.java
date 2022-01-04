package com.gfl.pizzabuilder;

import com.gfl.pizzabuilder.NewYorkPizza.Size;
import com.gfl.pizzabuilder.Pizza.Topping;

public class PizzaDirector {
  
  public static void main(String[] args){
    NewYorkPizza nyPizza = new NewYorkPizza.Builder(Size.SMALL).addTopping(Topping.SAUSAGE)
                                .addTopping(Topping.ONION).build();
    System.out.println(nyPizza);
    CalzonePizza czPizza = new CalzonePizza.Builder().addTopping(Topping.HAM).sauceInside().build();
    System.out.println(czPizza);
  }
}
