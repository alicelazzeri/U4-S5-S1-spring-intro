package it.epicode.springintro.services;

import it.epicode.springintro.entities.Order;
import it.epicode.springintro.enums.OrderStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j

public class OrderCreationServiceImplementation implements OrderCreationService {
    private final Map<Integer, Order> orders = new HashMap<>();

    @Override
    public void createOrder(Order order) {
        orders.put(order.getOrderNumber(), order);
    }

    @Override
    public void updateOrder(int orderNumber, OrderStatus orderStatus) {
        Order order = orders.get(orderNumber);
        if (order != null) {
            order.setOrderStatus(orderStatus);
        }
    }

    @Override
    public Order getOrder(int orderNumber) {
        Order order = orders.get(orderNumber);
        if (order != null) {
            return order;
        }
        return order;
    }
}
