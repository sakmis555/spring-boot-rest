package com.saksham.springbootrest.service;

import com.saksham.springbootrest.model.Contact;
import com.saksham.springbootrest.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public Contact addContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact updateContact(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact deleteById(int contactId) {
        Contact deletedContact = contactRepository.findById(contactId).orElse(new Contact());
        contactRepository.deleteById(contactId);
        return deletedContact;
    };

    public Contact getContactById(int id) {
        return contactRepository.findById(id).orElse(new Contact());
    }
}
