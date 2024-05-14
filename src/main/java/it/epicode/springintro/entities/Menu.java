package it.epicode.springintro.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j

public class Menu {
   private List<Pizza> pizzas;
   private List<Topping> pizzaToppings;
   private List<Drink> drinks;

   public void viewMenu() {
       log.info("------------ MENU ------------");

       log.info("------------ Pizzas ------------");
       this.pizzas.forEach(pizza -> log.info(String.valueOf(pizza)));
       System.out.println();

       log.info("------------ Topping ------------");
       this.pizzaToppings.forEach(pizzaTopping -> log.info(String.valueOf(pizzaTopping)));
       System.out.println();

       log.info("------------ Drink ------------");
       this.drinks.forEach(drink -> log.info(String.valueOf(drink)));
       System.out.println();




   }
}
