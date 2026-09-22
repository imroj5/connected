package org.example;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class OrederService {

    private final PaymentService paymentService;

    public OrederService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void orderService(){
        paymentService.Pay();

        System.out.println("order placed");
    }
}
