package com.vivek.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.entity.Contact_Details;
import com.vivek.service.ContactService;

@RestController
@CrossOrigin
public class ContactController {

	@Autowired
	private ContactService contactService;

	@PostMapping("/contact")
	public ResponseEntity<String> createContact(@RequestBody Contact_Details contact_Details) {

		String createContact = contactService.createContact(contact_Details);

		return new ResponseEntity<String>(createContact, HttpStatus.CREATED);
	}

	@GetMapping("/contact/{cId}")
	public ResponseEntity<Contact_Details> getContactById(@PathVariable Integer cId) {

		Contact_Details contact_Details = contactService.getContactById(cId);

		return new ResponseEntity<Contact_Details>(contact_Details, HttpStatus.OK);

	}

	@DeleteMapping("/contact/{cId}")
	public ResponseEntity<String> deleteContact(@PathVariable Integer cId) {

		String deleteContact = contactService.deleteContactById(cId);

		return new ResponseEntity<String>(deleteContact, HttpStatus.OK);
	}

	@GetMapping("/contacts")
	public ResponseEntity<List<Contact_Details>> getAllContact() {
		List<Contact_Details> allContact = contactService.getAllContact();

		return new ResponseEntity<>(allContact, HttpStatus.OK);

	}

}
