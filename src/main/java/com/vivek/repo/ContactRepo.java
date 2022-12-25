package com.vivek.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vivek.entity.Contact_Details;

public interface ContactRepo extends JpaRepository<Contact_Details, Integer> {

}
