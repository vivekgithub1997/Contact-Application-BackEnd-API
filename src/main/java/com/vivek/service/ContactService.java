package com.vivek.service;

import java.util.List;

import com.vivek.entity.Contact_Details;

public interface ContactService {
	
	public String createContact(Contact_Details contact_Details);
	
	public Contact_Details getContactById(Integer contactId);
	
	public List<Contact_Details> getAllContact();
	
	public String deleteContactById(Integer contactId);
	
	public String updateContact(Contact_Details contact_Details);

}
