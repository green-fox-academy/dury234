package com.gfa.eshop.controller;

import com.gfa.eshop.model.EshopItem;
import com.gfa.eshop.service.EshopItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;

@Controller
public class EshopController {

    @GetMapping("/webshop")
    public String getWebshop(Model model) {
        model.addAttribute("items", EshopItemsService.getItems());
        return "webshop";
    }

    @GetMapping("/only-available")
    public String getOnlyAvailable(Model model) {
        model.addAttribute(
                "items",
                EshopItemsService.getItems().stream()
                        .filter(item -> item.getQuantityOfStock() > 0)
                        .collect(Collectors.toList())
        );
        return "webshop";
    }

    @GetMapping("/cheapest-first")
    public String getCheapestFirst(Model model) {
        model.addAttribute(
                "items",
                EshopItemsService.getItems().stream()
                        .sorted(Comparator.comparing(item -> Integer.valueOf(item.getPrice())))
                        .collect(Collectors.toList())
        );
        return "webshop";
    }

    @GetMapping("/average-stock")
    public String getAverageStock(Model model) {
        model.addAttribute(
                "average", "Average stock" +
                        EshopItemsService.getItems().stream()
                        .mapToDouble(EshopItem::getQuantityOfStock)
                        .average()
                        .getAsDouble()
        );
        return "average-stock";
    }

    @GetMapping("/contains-nike")
    public String getContainsNike(Model model) {
        model.addAttribute(
                "items",
                EshopItemsService.getItems().stream()
                        .filter(eshopItem -> eshopItem.getDescription().toLowerCase().contains("nike") ||eshopItem.getName().toLowerCase().contains("nike"))
                        .collect(Collectors.toList())
        );
        return "webshop";
    }

    @GetMapping("/most-expensive")
    public String getAverageStock(Model model) {
        model.addAttribute(
                "average", "Most expensive item is " +
                EshopItemsService.getItems().stream()
                        .sorted(Comparator.comparing(eshopItem -> Integer.valueOf(eshopItem.getPrice())))
                        .sorted(Collections.reverseOrder())
                        .findFirst()
        );
        return "average-stock";
    }

}
