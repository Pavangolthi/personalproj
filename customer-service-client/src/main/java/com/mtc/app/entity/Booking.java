package com.mtc.app.entity;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Booking implements Serializable{
	

	private int id;
	private int flight_number;
	private int customer_id;
}
