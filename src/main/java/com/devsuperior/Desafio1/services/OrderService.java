package com.devsuperior.Desafio1.services;

import com.devsuperior.Desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService service;

    public double total(Order order) {
        return order.getBasic() * (1 - order.getDiscount() / 100.0) + service.shipment(order);
    }

}
