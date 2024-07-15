package com.saksham.springbootrest.controller;

import com.saksham.springbootrest.model.Contact;
import com.saksham.springbootrest.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactService contactService;

    @GetMapping("contacts")
    public List<Contact> getContacts(String str){
        System.out.println("hello there" + str);
        return contactService.getAllContacts();
    };

    @GetMapping("contact/{contactId}")
    public Contact getContactById(@PathVariable("contactId") int contactId) {
        return contactService.getContactById(contactId);
    };

    @PostMapping("contact")
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.addContact(contact);
    };

    @PutMapping("contact")
    public Contact updateContact(@RequestBody Contact contact) {
        return contactService.updateContact(contact);
    };

    @DeleteMapping("contact/{contactId}")
    public Contact deleteContact(@PathVariable int contactId) {
        System.out.println("inside deleteContact");
        return contactService.deleteById(contactId);
    };
}
