package br.com.devdojo.essentials.model;

import javax.persistence.Entity;

@Entity
public class Student extends AbstractEntity{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}