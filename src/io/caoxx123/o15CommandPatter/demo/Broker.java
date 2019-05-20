package io.caoxx123.o15CommandPatter.demo;

import io.caoxx123.o15CommandPatter.service.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList=new ArrayList<Order>();
    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
}
