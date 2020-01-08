package br.com.devdojo.essentials.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.devdojo.essentials.model.Student;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByNameIgnoreCaseContaining(String name);
}