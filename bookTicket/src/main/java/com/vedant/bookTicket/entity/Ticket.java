package com.vedant.bookTicket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Ticket")
public class Ticket {
    @Id
    private long ticketId;
    private String name;
    private long seatNumber;
    private long price;

    public Ticket() {
    }

    public Ticket(long ticketId, String name, long seatNumber, long price) {
        this.ticketId = ticketId;
        this.name = name;
        this.seatNumber = seatNumber;
        this.price=price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(long seatNumber) {
        this.seatNumber = seatNumber;
    }
}
