package com.kinger.homeinventory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryController {

    @RequestMapping
    public String getInStockGroceries() {
        return "Nothing in stock";
    }
}
