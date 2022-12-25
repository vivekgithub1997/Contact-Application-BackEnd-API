package com.vivek.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class Contact_Details {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private long contactNumber;

}
