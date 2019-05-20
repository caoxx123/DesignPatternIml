package io.caoxx123.o15CommandPatter.demo;

import io.caoxx123.o15CommandPatter.service.serviceIml.BuyStock;
import io.caoxx123.o15CommandPatter.service.serviceIml.SellStock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcstock=new Stock();

        BuyStock buyStock=new BuyStock(abcstock);
        SellStock sellStock=new SellStock(abcstock);

        Broker broker=new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
