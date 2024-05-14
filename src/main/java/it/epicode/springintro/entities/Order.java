package it.epicode.springintro.entities;

import it.epicode.springintro.enums.OrderStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Data

public class Order {
    private int orderNumber;
    private OrderStatus orderStatus;
    private int placeSettingsNumber;
    private LocalDateTime takeoverTime;
    private List<BaseEntity> menuItems;
    private Table table;
    private Parameters placeSettingsFee;
    private double totalAmount;

    public Order(int placeSettingsNumber, Table table) {
        Random rndm = new Random();
        this.orderNumber = rndm.nextInt(1000, 100000);
        this.orderStatus = OrderStatus.IN_PROGRESS;
        this.placeSettingsNumber = placeSettingsNumber;
        this.takeoverTime = LocalDateTime.now();
        this.menuItems = menuItems;
        this.totalAmount = calculateTotalAmount(menuItems, placeSettingsFee.getPlaceSettingsFee(), placeSettingsNumber);
        this.table = table;
    }

    private double calculateTotalAmount(List<BaseEntity> menuItems, double placeSettingsFee, int placeSettingsNumbers) {
        double total = placeSettingsFee * placeSettingsNumbers;
        for(BaseEntity item : menuItems) {
            total += item.getPrice();
        }
        return total;
    }

    public void addItem(BaseEntity item) {
        this.menuItems.add(item);
    }
}
