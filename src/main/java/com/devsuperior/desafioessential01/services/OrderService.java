package com.devsuperior.desafioessential01.services;

import com.devsuperior.desafioessential01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

/* anotação de injeção de dependência */
@Autowired
    ShippingService shippingService;

    /* método de cálculo da ordem conforme regra definida no negócio */
    public double total(Order order){
        return order.getBasic() * ( 1 - (order.getDiscount() / 100) ) + shippingService.Shipment(order) ;
    }
}
