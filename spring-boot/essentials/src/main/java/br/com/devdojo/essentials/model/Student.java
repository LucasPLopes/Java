package br.com.devdojo.essentials.model;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

public class Student {

    private Long id;
    private final String name;
    public static List<Student> studentList;
    static{
        studentRepository();
    }
    public Student() {
        name = "";
        id = -1L;
    }

    public Student(final String name) {
        this.name = name;
        this.id = -1L;
    }

    public Student(final Long id, final String name) {
        this(name);
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return id;
    }

    private static void studentRepository() {
        studentList = new ArrayList<>(asList(new Student(1L, "Lucas"), new Student(2L, "Ana")));
    }
}