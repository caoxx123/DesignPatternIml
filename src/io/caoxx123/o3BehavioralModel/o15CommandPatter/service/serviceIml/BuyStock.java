package io.caoxx123.o3BehavioralModel.o15CommandPatter.service.serviceIml;

import io.caoxx123.o3BehavioralModel.o15CommandPatter.demo.Stock;
import io.caoxx123.o3BehavioralModel.o15CommandPatter.service.Order;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
