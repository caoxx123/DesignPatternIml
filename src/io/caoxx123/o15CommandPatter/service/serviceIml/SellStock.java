package io.caoxx123.o15CommandPatter.service.serviceIml;

import io.caoxx123.o15CommandPatter.demo.Stock;
import io.caoxx123.o15CommandPatter.service.Order;

public class SellStock implements Order {
    private Stock sellStock;

    public SellStock(Stock sellStock) {
        this.sellStock = sellStock;
    }

    @Override
    public void execute() {
        sellStock.sell();
    }
}
