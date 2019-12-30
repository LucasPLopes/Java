package br.com.devdojo.essentials.model;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

public class Student {

    private Integer id;
    private final String name;
    public static List<Student> studentList;
    static{
        studentRepository();
    }
    public Student() {
        name = "";
        id = -1;
    }

    public Student(final String name) {
        this.name = name;
        this.id = -1;
    }

    public Student(final Integer id, final String name) {
        this(name);
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    
    private static void studentRepository() {
        studentList = new ArrayList<>(asList(new Student(1, "Lucas"), new Student(2, "Ana")));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}