package com.vnk.MVC.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnk.MVC.Entity.TicketDetails;
import com.vnk.MVC.Repositories.TravelReposit;

@Service
public class TravelOperations implements TravelServices{
@Autowired
private TravelReposit trl;

@Override
public TicketDetails bookTicket(TicketDetails ticket) {
	TicketDetails st=trl.save(ticket);
	/*try {
		TicketDetails st=trl.save(ticket);
		   if(st!=null) 
		    return "Successfully Book Your Tickrt" ;
	  else 
			return "Not Book Your ticket";
		}catch (Exception e) {
		return "Not Register";
		}*/
	return st ;
}

@Override
public TicketDetails login(int no, String str) {
	TicketDetails t=trl.loginTicket(no, str);
	return t;
}

@Override
public TicketDetails updateDetails(int no) {
	Optional<TicketDetails> op=trl.findById(no);
	TicketDetails td=op.get();
	return td;
}

@Override
public String editDetails(TicketDetails tkt) {
	String str=trl.save(tkt).getCustName();
	return "Update Your details Successfully... "+str;
}

@Override
public String cancelTicket(int no) {
	if(trl.existsById(no)) {
		trl.deleteById(no);
		return "Cancel Your ticket Successfully....";		
	}else {
		return "Not Cancel Your ticket Successfully....";
	}
}
 
}
