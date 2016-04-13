package org.moto.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by Nahid on 4/12/2016.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long Id;

    @NotNull
    private String Name,Email;

    public User(String name, String email) {
        Name = name;
        Email = email;
    }

    public User() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
