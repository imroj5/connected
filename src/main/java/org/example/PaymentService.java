package org.example;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void paymentService(){
        System.out.println("payment is successful");
    }

}
