package com.example.MVP.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Record extends AbstractBase{

    @ManyToOne
    private Category category;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 20, message = "Last Name must be between 3 and 20 characters.")
    private String lastName;

    @Email(message = "Invalid email, please try again.")
    private String email;

    @Size(min = 10, max = 13, message = "Please enter a valid phone number with an area code.")
    private double phoneNumber;

    @Size(max = 20, message = "Relationship cannot exceed 20 characters.")
    private String relationship;

    public Record(){ }

    public Record(Category category) {
        super();
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
