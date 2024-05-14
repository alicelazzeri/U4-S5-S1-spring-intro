package it.epicode.springintro.services;

import it.epicode.springintro.entities.BaseEntity;
import it.epicode.springintro.entities.Order;
import it.epicode.springintro.enums.OrderStatus;

import java.util.List;

public interface OrderCreationService {
    void createOrder(Order order);
    void updateOrder(int orderNumber, OrderStatus orderStatus);
    Order getOrder(int orderNumber);
}
