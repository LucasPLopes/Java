package br.com.devdojo.essentials.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.devdojo.essentials.model.User;

public interface UserRepository extends PagingAndSortingRepository<User,Long>{
    User findByUsername(String username);
}