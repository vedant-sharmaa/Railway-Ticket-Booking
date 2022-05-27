package com.vedant.bookTicket.controller;

import com.vedant.bookTicket.common.Transaction;
import com.vedant.bookTicket.entity.Ticket;
import com.vedant.bookTicket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class TicketController {

    @Autowired
    private TicketService service;

    @RequestMapping("/{id}")
    public Optional<Ticket> getTicketById(@PathVariable long id){
        return service.getTicketById(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Transaction makeBooking(@RequestBody Transaction transaction){
        return service.makeBooking(transaction);
    }
}
