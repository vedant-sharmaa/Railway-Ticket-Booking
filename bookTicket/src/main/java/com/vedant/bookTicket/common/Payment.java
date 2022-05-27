package com.vedant.bookTicket.common;

public class Payment {

    private long paymentId;
    private String status;
    private long ticketId;
    private long price;

    public Payment() {
    }

    public Payment(long paymentId, String status, long ticketId, long price) {
        this.paymentId = paymentId;
        this.status = status;
        this.ticketId=ticketId;
        this.price=price;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
