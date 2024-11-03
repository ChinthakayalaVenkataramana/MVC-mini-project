package com.vnk.MVC.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class TicketDetails {
@Id
@SequenceGenerator(name ="ticketNo",sequenceName = "TNo",allocationSize =1,initialValue = 154636 )
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ticketNo")
private Integer ticketNo;

@NonNull	
@Column(length = 30)
private String custName;

@NonNull
private Long custPhoneNo;

@NonNull
@Column(length = 30)
private String custAdd;

@NonNull
@Column(length = 30)
private String startPlace;

@NonNull
@Column(length = 30)
private String endPlace;

@NonNull
@Column(length = 30)
private String travelsName;

@NonNull
private Double amount;
}
