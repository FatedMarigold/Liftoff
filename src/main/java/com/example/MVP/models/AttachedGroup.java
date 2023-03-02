package com.example.MVP.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class AttachedGroup {

    @Id
    @NotBlank(message = "Must have a name.")
    @Size(min = 5, max = 20, message = "Name must be between 5 and 20 characters.")
    private String name;

    @NotBlank(message = "Must have a password.")
    @Size(min = 3, max = 20, message = "Password must be between 3 and 20 Characters.")
    private String password;

    @ManyToMany(mappedBy = "attachedGroups")
    private List<User> usersWithAccess = new ArrayList<>();

    public AttachedGroup(String name, String password, User user){
        this.name = name;
        this.password = password;
        usersWithAccess.add(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsersWithAccess() {
        return usersWithAccess;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachedGroup that = (AttachedGroup) o;
        return name == that.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
