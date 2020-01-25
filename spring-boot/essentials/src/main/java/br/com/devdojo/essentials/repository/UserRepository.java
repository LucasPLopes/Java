package br.com.devdojo.essentials.repository;

import br.com.devdojo.essentials.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String username);
}
