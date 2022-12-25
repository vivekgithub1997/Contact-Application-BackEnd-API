package com.vivek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.entity.Contact_Details;
import com.vivek.repo.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo contactRepo;

	@Override
	public String createContact(Contact_Details contact_Details) {

		Contact_Details save = contactRepo.save(contact_Details);
		if (save != null) {

			return "Contact Saved..!!";
		}

		return "Contact Not saved.....!!";
	}

	@Override
	public Contact_Details getContactById(Integer contactId) {
		Contact_Details contact_Details = null;
		Optional<Contact_Details> findById = contactRepo.findById(contactId);
		if (findById.isPresent()) {
			contact_Details = findById.get();
		}
		return contact_Details;
	}

	@Override
	public List<Contact_Details> getAllContact() {

		List<Contact_Details> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public String deleteContactById(Integer contactId) {

		try {
			contactRepo.deleteById(contactId);
			return " Contact Deleted....!!";

		} catch (Exception e) {

			System.out.println(e + " " + e.getMessage());
		}

		return "Contact Not Deleted...!!";
	}

	@Override
	public String updateContact(Contact_Details contact_Details) {
		Contact_Details save = contactRepo.save(contact_Details);
		if (save != null) {
			return "Update Success";
		}
		return "Update Not Success";
	}

}
