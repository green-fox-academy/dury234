package com.gfa.eshop.service;

import com.gfa.eshop.model.EshopItem;

import java.util.ArrayList;
import java.util.List;

public class EshopItemsService {
    private static List<EshopItem> items = new ArrayList<>(List.of(
            new EshopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5),
            new EshopItem("Printer", "Some HP printer that will print pages", 3000, 2),
            new EshopItem("Coca cola", "0,5l standard coke", 25, 0),
            new EshopItem("Wokin", "Chicken fried rice and WOKIN sauce", 119, 100),
            new EshopItem("T-shirt", "Blue with a corgi on a bike", 300, 1)
    ));

    public static List<EshopItem> getItems() {
        return items;
    }
}
