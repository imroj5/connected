package org.example;

import java.util.*;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component

public class OrederService {

    private PaymentService ps;

    public OrederService(PaymentService ps){
        this.ps=ps;
    }

    public void orederService(){

        ps.paymentService();
        System.out.println("order is success");
    }


}
