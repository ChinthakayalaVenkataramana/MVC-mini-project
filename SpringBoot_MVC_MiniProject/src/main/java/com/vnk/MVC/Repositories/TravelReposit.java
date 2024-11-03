package com.vnk.MVC.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vnk.MVC.Entity.TicketDetails;
public interface TravelReposit extends JpaRepository<TicketDetails, Integer> {
@Query("from TicketDetails where ticketNo=:tick and custName=:uName")
public TicketDetails loginTicket(int tick,String uName);
}
