package br.com.devdojo.essentials.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.devdojo.essentials.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByName(String name);
}