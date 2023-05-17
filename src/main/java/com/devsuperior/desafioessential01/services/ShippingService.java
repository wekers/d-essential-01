package com.devsuperior.desafioessential01.services;

import com.devsuperior.desafioessential01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double Shipment(Order order){

        if(order.getBasic() < 100)
            return 20.00;
        else if (order.getBasic() >= 100 && order.getBasic() < 200)
            return 12.00;
        else if (order.getBasic() >= 200)
            return 0;

        return 0;
    }
}
