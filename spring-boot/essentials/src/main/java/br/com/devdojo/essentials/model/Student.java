package br.com.devdojo.essentials.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student extends AbstractEntity{
    
    @NotEmpty(message= "O nome é obrigatório")
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;
 
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}