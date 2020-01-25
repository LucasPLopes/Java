package br.com.devdojo.essentials.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import static  br.com.devdojo.essentials.utils.PasswordEncoder.encode;

@Entity
public class User extends AbstractEntity{

    @NotNull
    @Column(unique=true)
    private String username;
    @NotEmpty
    @JsonIgnore
    private String password;
    @Column
    private String name;
    @Column
    private boolean admin;

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
        this.password = encode(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


}
