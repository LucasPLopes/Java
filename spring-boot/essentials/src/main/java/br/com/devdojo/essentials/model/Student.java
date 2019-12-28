package br.com.devdojo.essentials.model;

public class Student {
    private String name;

    public Student() {
        name = "";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}