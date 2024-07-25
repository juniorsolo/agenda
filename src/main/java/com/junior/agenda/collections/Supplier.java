package com.junior.agenda.collections;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Supplier {
	
	@Id
	private String id;
	private String name;
	private List<Phone> phones;
	private List<String> items;
	private Address address;
	private Boolean active;
	
	public Supplier() {
		active = true;
	}

	public Supplier(String id, String name, List<Phone> phones, List<String> items, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones;
		this.items = items;
		this.active = active;
	}
	
	

}
