package com.vedant.payment.controller;

import com.vedant.payment.entity.Payment;
import com.vedant.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @RequestMapping("/{id}")
    public Optional<Payment> getPaymentById(@PathVariable long id){
        return service.getPaymentById(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public void makePayment(@RequestBody Payment payment){
        service.makePayment(payment);
    }
}