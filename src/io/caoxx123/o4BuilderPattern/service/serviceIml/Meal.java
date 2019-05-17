package io.caoxx123.o4BuilderPattern.service.serviceIml;

import io.caoxx123.o4BuilderPattern.service.IItem;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    public List<IItem> iItemList = new ArrayList<>();

    public void addItem(IItem iItem) {
        iItemList.add(iItem);
    }

    public float getCost( ) {
        float cost = 0f;
        for (IItem iItem : iItemList) {
            cost+=iItem.price();
        }
        return cost;
    }

    public void showItem(){
        for (IItem iItem:iItemList){
            System.out.println("Item name:"+iItem.name());
            System.out.println("Item packing:"+iItem.packing().pack());
            System.out.println("Item price:"+iItem.price());
        }
    }
}
