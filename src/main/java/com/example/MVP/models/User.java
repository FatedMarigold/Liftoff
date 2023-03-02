package com.example.MVP.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User extends AbstractBase{

    @ManyToMany
    private List<AttachedGroup> attachedGroups = new ArrayList<>();

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 20, message = "Last Name must be between 3 and 20 characters.")
    private String lastName;

    @NotBlank(message = "Email is required.")
    @Email (message = "Invalid email, please try again.")
    private String email;

    @NotBlank(message = "Phone number is required.")
    @Size(min = 10, max = 13, message = "Please enter a valid phone number with an area code.")
    private double phoneNumber;

    @NotBlank(message = "Username is Required.")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters.")
    private String username;

    @NotBlank(message = "Password is required and must contain at least 1 uppercase and lowercase letter with at least one number or symbol. No spaces are allowed.")
    @Size(min = 5, max = 20, message = "Password must be between 5 and 20 characters.")
    private String password;

    @Size(max = 20, message = "Relationship cannot exceed 20 characters.")
    private String relationship;

    private Role role;

    public User(){ }

    public User(Role role) {
        super();
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
