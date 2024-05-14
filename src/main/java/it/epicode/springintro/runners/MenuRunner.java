package it.epicode.springintro.runners;

import it.epicode.springintro.entities.Menu;
import it.epicode.springintro.entities.Order;
import it.epicode.springintro.entities.Parameters;
import it.epicode.springintro.entities.Table;
import it.epicode.springintro.enums.OrderStatus;
import it.epicode.springintro.services.OrderCreationService;
import it.epicode.springintro.springIntroApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import static it.epicode.springintro.enums.OrderStatus.*;

@Component
@Slf4j

public class MenuRunner implements CommandLineRunner {

    @Autowired
    Menu menu;

    @Autowired
    OrderCreationService orderCreationService;

    @Autowired
    Parameters parameters;


    @Override
    public void run(String... args) throws Exception {

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(springIntroApplication.class)){

            Menu menu = ctx.getBean(Menu.class);
            menu.viewMenu();

            Table table = ctx.getBean(Table.class);

            Order order = new Order (4, table);

            orderCreationService.createOrder(order);
            log.info("Order created: {}", order);

            orderCreationService.updateOrder(order.getOrderNumber(), SERVED);
            log.info("Order status changed: {}", order.getOrderNumber());


        } catch (Exception e) {

        }


    }
}
