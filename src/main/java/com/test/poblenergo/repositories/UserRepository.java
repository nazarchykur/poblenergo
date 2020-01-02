package com.test.poblenergo.repositories;

import com.test.poblenergo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByFirstName(String firstName);

    Optional<User> findOneByLogin(String login);
}
