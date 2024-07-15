package com.saksham.springbootrest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contact {
    @Id
    private int contactId;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
    private String contactAddress;
}
