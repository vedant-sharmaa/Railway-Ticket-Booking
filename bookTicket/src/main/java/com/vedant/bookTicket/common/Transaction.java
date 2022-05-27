package com.vedant.bookTicket.common;

import com.vedant.bookTicket.entity.Ticket;

public class Transaction {
    private Ticket ticket;
    private Payment payment;
    private String message;

    public Transaction() {
    }

    public Transaction(Ticket ticket, Payment payment, String message) {
        this.ticket = ticket;
        this.payment = payment;
        this.message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
