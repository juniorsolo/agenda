package com.junior.agenda.collections;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone implements Serializable{
	
	private static final long serialVersionUID = -6052756242142795324L;
	
	private String ddd;
	private String number;
	
}
