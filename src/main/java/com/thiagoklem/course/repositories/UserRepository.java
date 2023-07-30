package com.thiagoklem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoklem.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
