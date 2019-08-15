package prueba.builder02;

import static prueba.builder02.Pizza.Topping.*;
import static prueba.builder02.NyPizza.Size.*;

public class Main {
	public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        NyPizza p = new NyPizza.Builder(MEDIUM).addTopping(null).build();
        
        System.out.println(pizza);
        System.out.println(calzone);
        System.out.println(p);
        
    }
}
