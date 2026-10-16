package com.klef.soa.exam.service;

import java.util.List;
import com.klef.soa.exam.entity.CoffeeShop;

public interface CoffeeShopService 
{
    CoffeeShop addcoffeeshop(CoffeeShop c);
    List<CoffeeShop> displayAll();
    String deleteCoffeeShopById(Long id);
}