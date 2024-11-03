package com.vnk.MVC.Services;

import com.vnk.MVC.Entity.TicketDetails;

public interface TravelServices {
public abstract TicketDetails bookTicket(TicketDetails ticket)throws Exception;
public TicketDetails login(int no,String str);
public TicketDetails updateDetails(int no);
public String editDetails(TicketDetails tkt);
public String cancelTicket(int no);
}
