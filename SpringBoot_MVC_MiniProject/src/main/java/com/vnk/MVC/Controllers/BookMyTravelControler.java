package com.vnk.MVC.Controllers;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vnk.MVC.Entity.TicketDetails;
import com.vnk.MVC.Repositories.TravelReposit;
import com.vnk.MVC.Services.TravelOperations;

@Controller
public class BookMyTravelControler {
@Autowired
private TravelOperations tp;

@Autowired
private TravelReposit tr;

   @GetMapping("/")
   public String index() {
	 return "index";
   }
   
   @GetMapping("/register")
   public String register(@ModelAttribute("ticket") TicketDetails tks) {
	 return "bookticket";
   }
   @PostMapping("/register")
   public String add(@ModelAttribute("ticket") TicketDetails tks,Map<String,Object> map) {
	   TicketDetails st=tp.bookTicket(tks);
	   map.put("result", st.getCustName()+" Successfully Booked Your ticket");
	   return "showMasseges";
   }
   
   @GetMapping("/login")
   public String loginticket() {
	   return "loginpage";
   }
   @PostMapping("/login")
   public String loginUser(@RequestParam("num")int num,@RequestParam("name")String name,Map<String,Object> map) {
	  TicketDetails str=tp.login(num, name);
	  if(tr.existsById(num)&& str!=null) {
	  map.put("details",str);
	  return "home";
	  }else {
	  map.put("result", "Invalid Details");
	  return "showMasseges";  
	  }
   }
   
   @GetMapping("/edit")
   public String editTicket(@RequestParam("no")int no, @ModelAttribute("update")TicketDetails tk) {
	   TicketDetails ticket=tp.updateDetails(no);
	   BeanUtils.copyProperties(ticket,tk);
	   return "updateTicket";
   }
   @PostMapping("/edit")
   public String UpdateTicket(RedirectAttributes attrs,@ModelAttribute("update")TicketDetails tkt) {
	   tp.editDetails(tkt);
	   System.out.println(tkt);
	   //attrs.addFlashAttribute("result",str);
	   return "redirect:home";
   }
   
   @GetMapping("/cancel")
   public String cancelMyTicket(@RequestParam("no") int no,Map<String, Object> map) {
	  String str= tp.cancelTicket(no);
	  map.put("result", str);
	   return "showMasseges"; 
   }
   
}
