package com.vedant.payment.service;

import com.vedant.payment.entity.Payment;
import com.vedant.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repo;

    public Optional<Payment> getPaymentById(long id){
        return repo.findById(id);
    }
    public void makePayment(Payment payment){
        repo.save(payment);
    }
}
