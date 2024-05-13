package it.epicode.springintro.entities;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Slf4j
public class AppConfig {

    @Bean ( name = "tomato")
    public Topping tomatoBean() {
        Topping tomatoTopping = new Topping("Tomato", 0);
        return tomatoTopping;
    }

    @Bean ( name = "cheese")
    public Topping cheeseBean() {
        Topping cheeseTopping = new Topping("Cheese", 92, 0.69);
        return cheeseTopping;
    }

    @Bean (name = "ham")
    public Topping hamBean() {
        Topping hamTopping = new Topping("Ham", 35, 0.99);
        return hamTopping;
    }

    @Bean (name = "onions")
    public Topping onionsBean() {
        Topping onionsTopping = new Topping ("Onions", 22, 0.69);
        return onionsTopping;
    }

    @Bean (name = "pineapple")
    public Topping pineappleBean() {
        Topping pineappleTopping = new Topping("Pineapple", 24, 0.79);
        return pineappleTopping;
    }

    @Bean (name = "salami")
    public Topping salamiBean() {
        Topping salamiTopping = new Topping("Salami", 86, 0.99);
        return salamiTopping;
    }

    @Bean (name = "pizzaMargherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomatoBean());
        toppings.add(cheeseBean());
        Pizza pizzaMargherita = new Pizza("Pizza Margherita", 1104, 4.99, toppings);
        return pizzaMargherita;
    }

    @Bean (name = "hawaiianPizza")
    public Pizza hawaiianPizzaBean() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomatoBean());
        toppings.add(cheeseBean());
        toppings.add(hamBean());
        toppings.add(pineappleBean());
        Pizza hawaiianPizza = new Pizza("Hawaiian Pizza", 1024, 6.49, toppings);
        return hawaiianPizza;
    }

    @Bean (name = "salamiPizza")
    public Pizza salamiPizzaBean() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomatoBean());
        toppings.add(cheeseBean());
        toppings.add(salamiBean());
        Pizza salamiPizza = new Pizza ("Salami Pizza", 1160, 5.99, toppings);
        return salamiPizza;
    }

    @Bean (name = "lemonade")
    public Drink lemonadeBean() {
        Drink lemonade = new Drink("Lemonade (0.33 l)", 128, 1.29);
        return lemonade;
    }

    @Bean (name = "water")
    public Drink waterBean() {
        Drink water = new Drink("Water (0.5 l)", 0, 1.29);
        return water;
    }

    @Bean(name = "wine")
    public Drink wineBean() {
        Drink wine = new Drink("Wine (0.75 l, 13%", 607, 7.49);
        return wine;
    }

    @Bean (name = "menu")
    public Menu menuBean() {
        List<Pizza> pizzas = new ArrayList<>();
        List<Topping> pizzaToppings = new ArrayList<>();
        List<Drink> drinks = new ArrayList<>();

        pizzas.add(pizzaMargheritaBean());
        pizzas.add(hawaiianPizzaBean());
        pizzas.add((salamiPizzaBean()));

        pizzaToppings.add(tomatoBean());
        pizzaToppings.add(cheeseBean());
        pizzaToppings.add(hamBean());
        pizzaToppings.add(onionsBean());
        pizzaToppings.add(pineappleBean());
        pizzaToppings.add(salamiBean());

        drinks.add(lemonadeBean());
        drinks.add(waterBean());
        drinks.add(wineBean());

        Menu menu = new Menu(pizzas, pizzaToppings, drinks);
        return menu;

    }

    }










