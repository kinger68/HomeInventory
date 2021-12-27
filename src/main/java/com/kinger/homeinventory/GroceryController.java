package com.kinger.homeinventory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryController {

    @RequestMapping
    public String mainMenu() {
        return "Welcome to our family";
    }

    @RequestMapping("/inStock")
    public String getInStockGroceries() {
        return "Nothing in stock";
    }
}
