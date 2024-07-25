package com.junior.agenda.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	private State state;
	private String city;
	private String district;
	private String street;
	private String number;
	
}
