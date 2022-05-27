package com.vedant.bookTicket.service;

import com.vedant.bookTicket.common.Payment;
import com.vedant.bookTicket.common.Transaction;
import com.vedant.bookTicket.entity.Ticket;
import com.vedant.bookTicket.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class TicketService {

    @Autowired
    private TicketRepository repo;

    @Autowired
    private RestTemplate template;

    public Optional<Ticket> getTicketById(long id){
        return repo.findById(id);
    }
    public Transaction makeBooking(Transaction transaction){
        Payment payment=transaction.getPayment();
        Ticket ticket=transaction.getTicket();
        payment.setTicketId(ticket.getTicketId());
        payment.setPrice(ticket.getPrice());
        if (payment.getStatus().equals("Success")) {
            repo.save(ticket);
            template.postForObject("http://PAYMENT-SERVICE/payment", payment, Payment.class);
            String message="Payment is success";
            return new Transaction(ticket, payment, message);
        }
        else {
            String message="Payment is failure";
            return new Transaction(ticket,payment,message);
        }
    }
}
