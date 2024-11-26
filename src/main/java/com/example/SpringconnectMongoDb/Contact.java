package com.example.SpringconnectMongoDb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts") // MongoDB to'plami
public class Contact {
    @Id
    private String id;
    private String name;         // Kontaktning ismi
    private String phoneNumber;  // Telefon raqami
    private String email;        // Elektron pochta

    // Getter va Setter metodlar

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
