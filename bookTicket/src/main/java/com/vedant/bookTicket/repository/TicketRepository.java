package com.vedant.bookTicket.repository;

import com.vedant.bookTicket.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
